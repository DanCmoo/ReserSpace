package com.dancmo.project.reserspace.services.mapper;

import com.dancmo.project.reserspace.persistence.entity.User;
import com.dancmo.project.reserspace.presentation.model.UserDTO;


public interface UserMapper {

    UserDTO userToUserDTO(User user);

}
