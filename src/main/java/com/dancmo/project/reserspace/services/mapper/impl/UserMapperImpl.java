package com.dancmo.project.reserspace.services.mapper.impl;

import com.dancmo.project.reserspace.persistence.entity.User;
import com.dancmo.project.reserspace.presentation.model.UserDTO;
import com.dancmo.project.reserspace.services.mapper.UserMapper;


public class UserMapperImpl implements UserMapper {
    @Override
    public UserDTO userToUserDTO(User user) {
        if(user == null) {
            return null;
        }
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), user.getFirstName(),user.getLastName(),user.getPhoneNumber(),user.getIsActive() );
    }

}
