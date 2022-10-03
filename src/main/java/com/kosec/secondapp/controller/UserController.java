package com.kosec.secondapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kosec.secondapp.model.UserRecord;
import com.kosec.secondapp.services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public List<UserRecord> getAllUser(){
        return userService.getAllUsers();
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)    
    public void addUser(@RequestBody UserRecord userRecord)  
    {    
        userService.addUser(userRecord);    
    }   
    
}
