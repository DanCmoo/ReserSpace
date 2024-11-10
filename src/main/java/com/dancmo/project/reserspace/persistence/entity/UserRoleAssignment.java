package com.dancmo.project.reserspace.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "user_role_assignments")
public class UserRoleAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_role_assignment_id")
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_role_id")
    private UserRole role;
}
