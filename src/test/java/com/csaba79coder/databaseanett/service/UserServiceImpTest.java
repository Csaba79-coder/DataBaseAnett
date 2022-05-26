package com.csaba79coder.databaseanett.service;

import com.csaba79coder.databaseanett.model.User;
import com.csaba79coder.databaseanett.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserServiceImpTest {


    UserRepository userRepository = Mockito.mock(UserRepository.class);
    UserService userService = Mockito.mock(UserService.class);


    @Test
    void addNewUser() {
        User fakeUser = new User(1L, "anett@anett.hu", "Anett");
        Mockito.when(userService.addNewUser(Mockito.any())).thenReturn(true);
        Assertions.assertTrue(userService.addNewUser(fakeUser));

        Mockito.when(userRepository.save(Mockito.any())).thenReturn(fakeUser);
        Assertions.assertEquals("Anett", fakeUser.getName());
    }
}