package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserRepository;
import com.test.model.Login;
import com.test.model.User;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  public UserRepository userRepo;

  public void addUser(User user) {
    userRepo.save(user);
  }

  public User validateUser(Login login) {
    return userRepo.findById(login.getUsername()).get();
  }

}
