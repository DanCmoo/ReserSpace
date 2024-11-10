package com.dancmo.project.reserspace.persistence.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public enum AvailabilityStatus {
    AVAILABLE("Available"),
    UNAVAILABLE("Unavailable"),
    MAINTENANCE("Under maintenance");
    private final String status;

    private AvailabilityStatus(String status) {
        this.status = status;
    }
}
