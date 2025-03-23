package com.root.moduleapplication.movie.dto;

import com.root.moduleapplication.position.dto.PositionRequestDto;
import com.root.moduleapplication.user.dto.UserRequestDto;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
