package com.root.moduledomain.moviebox.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieBoxRequestDto {
    private long id;
    private long movieId;
    private long boxNumber;
}
