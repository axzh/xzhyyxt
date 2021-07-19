package cn.yy.mapper;


import cn.yy.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User checkout(User user);
    void addUser(User user);
    List<User> findAllUser() ;
    void changePasswordById(@Param("id") int id,@Param("newpassword") String newpassword) ;
    void deleteUserById(int id);
}