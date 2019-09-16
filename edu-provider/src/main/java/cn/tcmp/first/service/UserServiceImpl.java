package cn.tcmp.first.service;

import cn.tcmp.first.dao.UserMapper;
import cn.tcmp.first.entity.User;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public Integer saveUser(User user) {
        return userMapper.saveUser(user);
    }
}
