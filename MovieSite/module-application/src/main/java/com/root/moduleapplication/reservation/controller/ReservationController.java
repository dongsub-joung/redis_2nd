package com.root.moduleapplication.reservation.controller;

import com.root.moduleapplication.reservation.service.ReservationServiceImpl;
import com.root.moduledomain.reservation.dto.ReservationRequestDto;
import com.root.moduledomain.reservation.dto.ReservationResponseDto;
import exception.NullCheckException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ReservationController {

    private ReservationServiceImpl reservationService;

    @GetMapping("/reservation")
    public ReservationResponseDto create(ReservationRequestDto reservationRequestDto) {
        try {
            var obj= reservationService.create(reservationRequestDto);

            if (obj == null) {
                throw new NullCheckException("reservation is null");
            }

            return obj;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}