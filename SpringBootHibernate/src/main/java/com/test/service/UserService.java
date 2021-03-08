package com.test.service;

import org.springframework.stereotype.Service;

import com.test.model.Login;
import com.test.model.User;

@Service
public interface UserService {

  void addUser(User user);

  User validateUser(Login login);
}
