package com.dancmo.project.reserspace.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "user_roles")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_role_id")
    private UUID id;
    private String roleName;

}
