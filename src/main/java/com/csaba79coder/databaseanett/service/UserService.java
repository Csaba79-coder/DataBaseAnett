package com.csaba79coder.databaseanett.service;

import com.csaba79coder.databaseanett.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    boolean addNewUser(User user);
}
