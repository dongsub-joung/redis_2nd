package com.root.moduledomain.movie.dto;

import com.root.moduledomain.genre.dto.GenreRequestDto;
import lombok.*;
import com.root.moduledomain.position.dto.PositionRequestDto;
import com.root.moduledomain.user.dto.UserRequestDto;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieRequestDto {
    private Long id;
    private List<PositionRequestDto> positions;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private Integer duration;
    private String imgUrl;
    private String position;

    private UserRequestDto user;
    private GenreRequestDto thema;
}
