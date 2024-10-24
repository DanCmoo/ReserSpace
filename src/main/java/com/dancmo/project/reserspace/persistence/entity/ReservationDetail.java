package com.dancmo.project.reserspace.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "reservation_details")
public class ReservationDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "reservation_detail_id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    private String detailKey;
    private String detailValue;
}
