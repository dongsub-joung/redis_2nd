package com.root.moduledomain.user.dto;

import com.root.moduledomain.movie.dto.MovieRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private List<MovieRequestDto> movies;
    private String positions;
    private String name;
    private String email;
    private String password;
    private Boolean guessed;
}
