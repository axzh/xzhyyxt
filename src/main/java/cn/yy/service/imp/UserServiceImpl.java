package cn.yy.service.imp;

import cn.yy.mapper.UserMapper;
import cn.yy.pojo.User;
import cn.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User checkout(User user) {
        return mapper.checkout(user);
    }

    @Override
    public void adduser(User user) {
        mapper.addUser(user);
    }

    @Override
    public void changePasswordById(int id,String newpassword ) {
        mapper.changePasswordById(id,newpassword);
    }

    @Override
    public void deleteUserById(int id) {
        mapper.deleteUserById(id);
    }

    @Override
    public List<User> findAllUser() {
        return mapper.findAllUser();
    }
}
