package com.root.moduledomain.position.dto;

import com.root.moduledomain.movie.dto.MovieRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PositionResponseDto {
    private long id;
    private long movieId;
    private String seatPosition;
}