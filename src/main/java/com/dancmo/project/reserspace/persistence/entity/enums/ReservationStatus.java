package com.dancmo.project.reserspace.persistence.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum ReservationStatus {
    PENDING("Pending"),
    CONFIRMED("Confirmed"),
    CANCELLED("Cancelled");
    private final String status;
    private ReservationStatus(String status) {
        this.status = status;
    }
}
