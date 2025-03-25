package com.root.moduleapplication.thema;

import com.root.moduledomain.movie.Movie;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThemaRequestDto {
    private Movie movie;
    private long themaTypeId;
}