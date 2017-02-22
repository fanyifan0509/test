package com.lai.service;

import com.lai.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/02/21.
 */
public interface UserService {
    User getUserById(Integer userId);
}
