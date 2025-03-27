package com.root.moduledomain.schedule;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "schedule")
@NoArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movieId")
    private long movieId;

    @Column(name = "scheduleTime")
    private String scheduleTime;
}
