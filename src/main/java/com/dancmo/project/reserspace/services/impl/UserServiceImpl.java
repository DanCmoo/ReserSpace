package com.dancmo.project.reserspace.services.impl;

import com.dancmo.project.reserspace.persistence.entity.User;
import com.dancmo.project.reserspace.persistence.repository.UserRepository;
import com.dancmo.project.reserspace.presentation.model.UserCreateDTO;
import com.dancmo.project.reserspace.presentation.model.UserDTO;
import com.dancmo.project.reserspace.services.UserService;
import com.dancmo.project.reserspace.services.mapper.UserCreateMapper;
import com.dancmo.project.reserspace.services.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserCreateMapper userCreateMapper;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,UserMapper userMapper,UserCreateMapper userCreateMapper,PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.userCreateMapper = userCreateMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDTO addUser(UserCreateDTO userCreateDTO) {
        User user = userCreateMapper.userCreateDTOToUser(userCreateDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);

        return userMapper.userToUserDTO(savedUser);

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
    public UserDTO getUserByUsername(String username) {
        try {
            User user = userRepository.findByUsername(username);
            return userMapper.userToUserDTO(user);
        }catch (Exception e) {
            return null;
        }
    }
}
