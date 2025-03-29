package com.root.moduledomain.reservation;


import com.root.moduledomain.reservation.dto.ReservationRequestDto;
import com.root.moduledomain.reservation.dto.ReservationResponseDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "reservation")
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "scheduleId")
    private Long scheduleId;

    @Column(name = "seatPositionId")
    private Long seatId;

    @Column(name = "movieBoxNumber")
    private Long movieBoxNumber;

    @Column(name = "userId")
    private Long userId;

    public Reservation(ReservationRequestDto reservationRequestDto) {
        this.scheduleId = reservationRequestDto.getScheduleId();
        this.seatId = reservationRequestDto.getSeatId();
        this.movieBoxNumber = reservationRequestDto.getMovieBoxNumber();
        this.userId = reservationRequestDto.getUserId();
    }
}
