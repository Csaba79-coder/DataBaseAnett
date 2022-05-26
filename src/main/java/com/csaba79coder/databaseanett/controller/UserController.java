package com.csaba79coder.databaseanett.controller;

import com.csaba79coder.databaseanett.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
// @RestController
@Getter
public class UserController {

    // http://localhost:8080/h2-console/
    // db name from application properties: jdbc:h2:mem:testdb

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


}
