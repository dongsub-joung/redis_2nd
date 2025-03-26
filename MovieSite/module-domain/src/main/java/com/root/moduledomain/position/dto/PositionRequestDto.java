package com.root.moduledomain.position.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PositionRequestDto {
    private long id;
    private long movieId;
    private String seatPosition;
}
