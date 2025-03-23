package com.root.moduleapplication.movie.dto;

import com.root.moduleapplication.position.dto.PositionRequestDto;
import com.root.moduleapplication.user.dto.UserRequestDto;
import com.root.moduledomain.movie.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponseDto {

    private List<PositionRequestDto> positions;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private Integer duration;
    private String imgUrl;
    private String position;

    private UserRequestDto user;

    public MovieResponseDto(Movie movie) {
        MovieResponseDto movieResponseDto = new MovieResponseDto(movie);
    }
}
