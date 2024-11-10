package com.dancmo.project.reserspace.persistence.entity;

import com.dancmo.project.reserspace.persistence.entity.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.sql.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "reservation_id")
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "space_id")
    private Space space;
    private Date reservationDate;
    private Timestamp startTime;
    private Timestamp endTime;
    private double totalPrice;
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
