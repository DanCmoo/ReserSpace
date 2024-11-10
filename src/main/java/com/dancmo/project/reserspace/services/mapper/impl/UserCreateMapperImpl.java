package com.dancmo.project.reserspace.services.mapper.impl;

import com.dancmo.project.reserspace.persistence.entity.User;
import com.dancmo.project.reserspace.presentation.model.UserCreateDTO;
import com.dancmo.project.reserspace.services.mapper.UserCreateMapper;


public class UserCreateMapperImpl implements UserCreateMapper {
    @Override
    public UserCreateDTO userToUserCreateDTO(User user) {
        if(user == null) {
            return null;
        }
        return new UserCreateDTO(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber());
    }

    @Override
    public User userCreateDTOToUser(UserCreateDTO userCreateDTO) {
        if(userCreateDTO == null) {
            return null;
        }
        User user = new User();
        user.setUsername(userCreateDTO.username());
        user.setPassword(userCreateDTO.password());
        user.setFirstName(userCreateDTO.firstName());
        user.setLastName(userCreateDTO.lastName());
        user.setEmail(userCreateDTO.email());
        user.setPhoneNumber(userCreateDTO.phoneNumber());
        return user;
    }
}
