package service.impl;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.User;
import service.LoginService;

/**
 * Created by ideapad on 5/6/2017.
 */
@Service
public class LoginServiceimpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUserId(String s) {
        return userMapper.selectByUserId(s);
    }
}
