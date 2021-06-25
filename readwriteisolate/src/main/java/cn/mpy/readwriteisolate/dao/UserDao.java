package cn.mpy.readwriteisolate.dao;

import cn.mpy.readwriteisolate.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user")
    List<User> findUsers();
    @Insert("insert into user(userid,username,usertel,usersex,password,salt) values(#{userid},#{username},#{usertel},#{usersex},#{password},#{salt})")
    int saveUser(User user);
    @Delete("delete from user where userid=#{userid}")
    int deleteUser(Integer userid);
    @Update("update user set username=#{username} where userid=#{userid}")
    int updateUser(User user);

}
