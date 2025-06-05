package org.example.controllers;

import org.example.models.dto.UserCreateRequest;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;



    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/test")
    public String createUser(@RequestBody UserCreateRequest user) {
        return userService.createUser(user);
    }


    @GetMapping("/get/test")
    public String getTest(){
        return "Hi there";
    }






}
