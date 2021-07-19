package cn.yy.service;

import cn.yy.pojo.User;

import java.util.List;

public interface UserService {
    User checkout(User user);
    void adduser(User user);
    List<User> findAllUser() ;
    void changePasswordById(int id,String newpassword) ;
    void deleteUserById(int id);


}