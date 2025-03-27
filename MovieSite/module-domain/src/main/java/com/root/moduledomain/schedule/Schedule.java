package com.root.moduledomain.schedule;


import com.root.moduledomain.schedule.dto.ScheduleRequestDto;
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

    public Schedule(ScheduleRequestDto scheduleRequestDto) {
        this.id = scheduleRequestDto.getId();
        this.movieId = scheduleRequestDto.getMovieId();
        this.scheduleTime = scheduleRequestDto.getScheduleTime();
    }
}
