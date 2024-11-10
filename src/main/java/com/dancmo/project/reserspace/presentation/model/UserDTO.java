package com.dancmo.project.reserspace.presentation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UserDTO(

        @JsonProperty("userId") UUID id,
        @JsonProperty("username") String username,
        @JsonProperty("email") String email,
        @JsonProperty("firstName") String firstName,
        @JsonProperty("lastName") String lastName,
        @JsonProperty("phoneNumber") String phoneNumber,
        @JsonProperty("isActive") Boolean isActive
) {
}
