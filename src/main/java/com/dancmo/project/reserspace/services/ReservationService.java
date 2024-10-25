package com.dancmo.project.reserspace.services;

import com.dancmo.project.reserspace.persistence.entity.Reservation;

import java.util.UUID;

public interface ReservationService {
    boolean addReservation(Reservation reservation);
    boolean updateReservation(UUID id,Reservation reservation);
    boolean deleteReservation(UUID id);
    Reservation getReservationById(UUID id);
}
