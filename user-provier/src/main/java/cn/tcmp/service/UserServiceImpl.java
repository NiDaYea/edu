package cn.tcmp.service;

import cn.tcmp.dao.UserMapper;
import cn.tcmp.entity.User;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public User queryUserJD(Integer userId) {
        return userMapper.queryUserJD(userId);
    }
}
