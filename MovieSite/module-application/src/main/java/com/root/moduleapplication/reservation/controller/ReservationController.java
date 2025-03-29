package com.root.moduleapplication.reservation.controller;

import com.root.moduleapplication.movie.service.MovieServiceImpl;
import com.root.moduleapplication.reservation.service.ReservationServiceImpl;
import com.root.moduledomain.movie.dto.MovieResponseDto;
import com.root.moduledomain.reservation.dto.ReservationRequestDto;
import com.root.moduledomain.reservation.dto.ReservationResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReservationController {

    private ReservationServiceImpl reservationService;

    @GetMapping("/reservation")
    public ReservationResponseDto create(ReservationRequestDto reservationRequestDto) {
        return reservationService.create(reservationRequestDto);
    }
}