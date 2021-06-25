package cn.mpy.readwriteisolate;

import cn.mpy.readwriteisolate.dao.UserDao;
import cn.mpy.readwriteisolate.entity.User;
import cn.mpy.readwriteisolate.service.UserService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ReadwriteisolateApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() throws InterruptedException {
        int i=0;
        while(i<100){
            List<User> users = this.userService.findUsers();
            System.out.println(JSONArray.toJSONString(users));
            i++;
            Thread.sleep(2000);
        }

    }
    @Test
    void test(){
        User user=new User();
        user.setUserid(3);
        user.setUsername("张三");
        user.setUsersex("男");
        user.setUsertel("18692145926");
        user.setPassword("123456");
        user.setSalt("654312");
        User user1 = this.userService.saveUser(user);
        System.out.println(JSONObject.toJSONString(user1));
    }
    @Test
    void dele(){
        boolean b = this.userService.deleteUser(3);
        System.out.println(b);
    }

}
