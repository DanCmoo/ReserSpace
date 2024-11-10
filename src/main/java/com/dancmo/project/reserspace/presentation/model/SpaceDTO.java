package com.dancmo.project.reserspace.presentation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SpaceDTO(
        UUID id,
        String name,
        String description,
        int capacity,
        String location,
        boolean available
) {
}
