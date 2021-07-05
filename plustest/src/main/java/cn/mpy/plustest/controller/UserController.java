package cn.mpy.plustest.controller;

import cn.mpy.plustest.entity.User;
import cn.mpy.plustest.service.UserService;
import cn.mpy.plustest.utils.HttpResult;
import cn.mpy.plustest.utils.HttpStatus;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/findall")
    public HttpResult findUsers(Integer page,Integer size){
        page=page==null?1:page;
        size=size==null?5:size;
        Page<User> page1 = new Page<>(page, size);
        Page<User> users = this.userService.findUsers(page1);
        return HttpResult.ok(users,"查询成功");
    }

    @PutMapping("insertuser")
    public HttpResult insertUser(@RequestBody User user){
        boolean b = this.userService.insertUser(user);
        if (b){
            HttpResult.error(HttpStatus.SC_BAD_REQUEST,"新增失败");
        }
        return HttpResult.ok("新增成功");
    }
}
