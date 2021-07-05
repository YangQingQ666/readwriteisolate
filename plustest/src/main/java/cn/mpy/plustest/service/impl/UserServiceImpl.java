package cn.mpy.plustest.service.impl;

import cn.mpy.plustest.entity.User;
import cn.mpy.plustest.mapper.UserMapper;
import cn.mpy.plustest.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService  {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Page<User> findUsers(Page<User> page) {
        return userMapper.selectPage(page,null);
    }

    @Override
    public boolean insertUser(User user) {
        int insert = this.userMapper.insert(user);
        return insert>0;
    }


}
