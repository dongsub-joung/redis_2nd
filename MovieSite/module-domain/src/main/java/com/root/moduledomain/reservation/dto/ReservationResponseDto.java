package com.root.moduledomain.reservation.dto;

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
}
