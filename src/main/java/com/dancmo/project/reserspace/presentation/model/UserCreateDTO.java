package com.dancmo.project.reserspace.presentation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UserCreateDTO(
        @NotNull
        @JsonProperty("username")
        String username,

        @NotNull
        @JsonProperty("password")
        String password,

        @JsonProperty("firstName")
        String firstName,

        @JsonProperty("lastName")
        String lastName,

        @NotNull
        @JsonProperty("email")
        String email,

        @JsonProperty("phoneNumber")
        String phoneNumber
) {
}
