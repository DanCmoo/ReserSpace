package com.dancmo.project.reserspace.services.impl;

import com.dancmo.project.reserspace.persistence.entity.User;
import com.dancmo.project.reserspace.persistence.repository.UserRepository;
import com.dancmo.project.reserspace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    public UserServiceImpl(@Autowired UserRepository userRepository) {
    }

    @Override
    public boolean addUser(User user) {
        try{
            userRepository.save(user);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    @Override
    public boolean deleteUserByUsername(String username) {
        try{
            return userRepository.deleteByUsername(username)>0;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean updatePasswordByUsername(String username, String password) {
        try{
            return userRepository.updatePasswordByUsername(username, password)>0;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public User getUserByUsername(String username) {
        try {
            return userRepository.findByUsername(username);
        }catch (Exception e) {
            return null;
        }
    }
}
