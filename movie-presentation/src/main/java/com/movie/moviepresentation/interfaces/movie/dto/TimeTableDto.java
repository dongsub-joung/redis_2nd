package com.movie.moviepresentation.interfaces.movie.dto;

import com.movie.movieapplication.movie.dto.TimeTableInfo;

import java.time.LocalDateTime;

public class TimeTableDto {

    public record Response(LocalDateTime startDate, LocalDateTime endDate) {
        public static Response of(LocalDateTime startDate, LocalDateTime endDate) {
            return new Response(startDate, endDate);
        }
        public static Response from(TimeTableInfo.Get info) {
            return Response.of(info.startDate(), info.endDate());
        }
    }

}
