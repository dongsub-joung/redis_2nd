package com.root.moduledomain.genre.dto;

import com.root.moduledomain.movie.Movie;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenreRequestDto {
    private long id;
    private long genreTypeId;
}