package com.kosec.secondapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosec.secondapp.model.UserRecord;
import com.kosec.secondapp.repository.UserRepository;

import java.util.List;    
import java.util.ArrayList;     

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserRecord> getAllUsers()
    {
        List<UserRecord>userRecords = new ArrayList<>();    
        userRepository.findAll().forEach(userRecords::add);    
        return userRecords; 
    }
    public void addUser(UserRecord userRecord)  
    {    
        userRepository.save(userRecord);    
    }  
}
