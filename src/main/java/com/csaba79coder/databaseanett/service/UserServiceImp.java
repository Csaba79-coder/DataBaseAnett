package com.csaba79coder.databaseanett.service;

import com.csaba79coder.databaseanett.model.User;
import com.csaba79coder.databaseanett.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean addNewUser(User user) {
        if (user != null) {
            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }
}
