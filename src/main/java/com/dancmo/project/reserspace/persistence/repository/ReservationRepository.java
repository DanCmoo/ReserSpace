package com.dancmo.project.reserspace.persistence.repository;

import com.dancmo.project.reserspace.persistence.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
