package com.dancmo.project.reserspace.presentation.controller;

import com.dancmo.project.reserspace.presentation.model.UserCreateDTO;
import com.dancmo.project.reserspace.presentation.model.UserDTO;
import com.dancmo.project.reserspace.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;

    }

    @PostMapping("/register")
    public ResponseEntity<UUID> createUser(@Valid @RequestBody UserCreateDTO userCreateDTO) {
        UserDTO  userDTO = userService.addUser(userCreateDTO);
        if (userDTO == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(userDTO.id());

    }

    @GetMapping("/{username}")
    public ResponseEntity<UserDTO> getUser(@PathVariable String username) {
        UserDTO userDTO = userService.getUserByUsername(username);
        if (userDTO == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDTO);
    }

}
