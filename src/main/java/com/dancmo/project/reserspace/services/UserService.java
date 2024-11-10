package com.dancmo.project.reserspace.services;

import com.dancmo.project.reserspace.persistence.entity.User;
import com.dancmo.project.reserspace.presentation.model.UserCreateDTO;
import com.dancmo.project.reserspace.presentation.model.UserDTO;

public interface UserService{
    UserDTO addUser(UserCreateDTO userCreateDTO);
    boolean deleteUserByUsername(String username);
    boolean updatePasswordByUsername(String username,String password);
    UserDTO getUserByUsername(String username);
}
