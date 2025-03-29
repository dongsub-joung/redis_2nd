package com.root.moduledomain.reservation.dto;

import com.root.moduledomain.reservation.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationResponseDto {
    private long id;
    private Long scheduleId;
    private Long seatId;
    private Long movieBoxNumber;
    private Long userId;

    public ReservationResponseDto(Reservation reservation) {
        this.id = reservation.getId();
        this.scheduleId = reservation.getScheduleId();
        this.seatId = reservation.getSeatId();
        this.movieBoxNumber = reservation.getMovieBoxNumber();
        this.userId = reservation.getUserId();
    }
}
