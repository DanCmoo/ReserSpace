package com.dancmo.project.reserspace.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    private double amount;
    private Date paymentDate;
    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;
}
