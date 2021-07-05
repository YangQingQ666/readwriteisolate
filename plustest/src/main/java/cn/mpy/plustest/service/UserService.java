package cn.mpy.plustest.service;

import cn.mpy.plustest.entity.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User> {
    Page<User> findUsers(Page<User> page);

    boolean insertUser(User user);
}
