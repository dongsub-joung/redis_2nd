package com.root.moduledomain.reservation;


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

    public Reservation(ReservationResponseDto reservationResponseDto) {
        this.id = reservationResponseDto.getId();
        this.scheduleId = reservationResponseDto.getScheduleId();
        this.seatId = reservationResponseDto.getSeatId();
        this.movieBoxNumber = reservationResponseDto.getMovieBoxNumber();
        this.userId = reservationResponseDto.getUserId();
    }
}
