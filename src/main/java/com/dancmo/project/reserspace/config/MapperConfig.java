package com.dancmo.project.reserspace.config;

import com.dancmo.project.reserspace.services.mapper.UserCreateMapper;
import com.dancmo.project.reserspace.services.mapper.UserMapper;
import com.dancmo.project.reserspace.services.mapper.impl.UserCreateMapperImpl;
import com.dancmo.project.reserspace.services.mapper.impl.UserMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public UserCreateMapper userCreateMapper() {
        return new UserCreateMapperImpl();
    }

    @Bean
    public UserMapper userMapper() {
        return new UserMapperImpl();
    }
}
