package com.root.moduledomain.position;

import com.root.moduledomain.movie.Movie;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "positionsa")
@Getter
@NoArgsConstructor
public class Position{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movieId")
    private long movieId;

    @Column(name = "seatPosition")
    private String seatPosition;
}
