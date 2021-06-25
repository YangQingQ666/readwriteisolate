package cn.mpy.readwriteisolate.service.impl;

import cn.mpy.readwriteisolate.dao.UserDao;
import cn.mpy.readwriteisolate.entity.User;
import cn.mpy.readwriteisolate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findUsers() {
        return this.userDao.findUsers();
    }

    @Override
    public User saveUser(User user) {
        this.userDao.saveUser(user);
        return user;
    }

    @Override
    public boolean deleteUser(Integer userid) {
        return this.userDao.deleteUser(userid)>0;
    }

    @Override
    public boolean updateUser(User user) {
        return this.userDao.updateUser(user)>0;
    }
}
