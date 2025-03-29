package com.root.moduleapplication.reservation.repository;

import com.root.moduledomain.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
