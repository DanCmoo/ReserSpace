package com.dancmo.project.reserspace.services.mapper;

import com.dancmo.project.reserspace.persistence.entity.User;
import com.dancmo.project.reserspace.presentation.model.UserCreateDTO;

public interface UserCreateMapper {
    UserCreateDTO userToUserCreateDTO(User user);
    User userCreateDTOToUser(UserCreateDTO userCreateDTO);
}
