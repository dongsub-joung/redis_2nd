package com.root.moduledomain.reservation;


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

    @Column(name = "userId")
    private Long userId;
}
