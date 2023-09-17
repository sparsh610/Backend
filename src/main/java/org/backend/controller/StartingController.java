package org.backend.controller;

import org.backend.data.User;
import org.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

@RestController
public class StartingController {

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public void printHello(){
        System.out.println("Hello");
    }

    @GetMapping("saveUser")
    public void saveUser() throws Exception {
        User user = new User(123,"sparsh","12345","adress",
                "sparshk610@gmail.com",new Date());
        userService.saveUser(Arrays.asList(user,new User()));


    }
}
