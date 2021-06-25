package cn.mpy.readwriteisolate.service;

import cn.mpy.readwriteisolate.entity.User;

import java.util.List;

public interface UserService {
    List<User> findUsers();
    User saveUser(User user);
    boolean deleteUser(Integer userid);
    boolean updateUser(User user);
}
