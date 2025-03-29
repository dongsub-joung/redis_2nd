package com.root.moduleapplication.reservation.repository;

import com.root.moduledomain.reservation.Reservation;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Override
    @Lock(LockModeType.PESSIMISTIC_READ)
    public Reservation save(Reservation reservation);
}
