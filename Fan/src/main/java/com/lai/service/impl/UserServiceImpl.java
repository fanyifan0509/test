package com.lai.service.impl;

import com.lai.dao.UserMapper;
import com.lai.entity.User;
import com.lai.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/02/21.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
