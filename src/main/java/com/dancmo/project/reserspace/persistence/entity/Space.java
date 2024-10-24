package com.dancmo.project.reserspace.persistence.entity;

import com.dancmo.project.reserspace.persistence.entity.enums.AvailabilityStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@Table(name = "spaces")
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String location;
    private int capacity;
    @Enumerated(EnumType.STRING)
    private AvailabilityStatus availabilityStatus;
    private String description;
    private double pricePerHour;
    private UUID spaceTypeId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
