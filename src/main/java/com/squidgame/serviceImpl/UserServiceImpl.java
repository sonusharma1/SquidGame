package com.squidgame.serviceImpl;

import com.squidgame.entity.User;
import com.squidgame.repository.UserRepository;
import com.squidgame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User createUser(User user) {
          User savedUser=userRepository.save(user);
        return savedUser;
    }
}
