package com.root.moduleapplication.reservation.service;

import com.root.moduleapplication.reservation.repository.ReservationRepository;
import com.root.moduledomain.reservation.Reservation;
import com.root.moduledomain.reservation.dto.ReservationRequestDto;
import com.root.moduledomain.reservation.dto.ReservationResponseDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationServiceImpl {
    private final ReservationRepository reservationRepository;

    @Transactional
    public ReservationResponseDto create(ReservationRequestDto reservationRequestDto) {
        Reservation reservation = new Reservation(reservationRequestDto);
        reservationRepository.save(reservation);
        return new ReservationResponseDto(reservation);
    }
}
