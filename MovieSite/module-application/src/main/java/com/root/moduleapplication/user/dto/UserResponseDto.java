package com.root.moduleapplication.user.dto;

import com.root.moduleapplication.movie.dto.MovieRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private List<MovieRequestDto> movies;
    private String positions;
    private String name;
    private String email;
    private String password;
    private Boolean guessed;
}

