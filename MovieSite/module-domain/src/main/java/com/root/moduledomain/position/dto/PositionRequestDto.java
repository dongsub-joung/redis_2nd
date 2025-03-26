package com.root.moduleapplication.position.dto;

import com.root.moduledomain.movie.dto.MovieRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PositionRequestDto {
    private MovieRequestDto movie;
    private String seatNumber;
}
