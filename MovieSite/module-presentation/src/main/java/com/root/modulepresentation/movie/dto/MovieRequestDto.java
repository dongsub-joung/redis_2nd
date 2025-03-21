package com.root.modulepresentation.movie.dto;

import com.root.modulepresentation.position.dto.PositionRequestDto;
import com.root.modulepresentation.user.dto.UserRequestDto;
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
public class MovieRequestDto {
    private List<PositionRequestDto> positions;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private Integer duration;
    private String imgUrl;
    private String position;

    private UserRequestDto user;
}
