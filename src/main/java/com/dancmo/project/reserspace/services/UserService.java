package com.dancmo.project.reserspace.services;

import com.dancmo.project.reserspace.persistence.entity.User;

public interface UserService{
    boolean addUser(User user);
    boolean deleteUserByUsername(String username);
    boolean updatePasswordByUsername(String username,String password);
    User getUserByUsername(String username);
}
