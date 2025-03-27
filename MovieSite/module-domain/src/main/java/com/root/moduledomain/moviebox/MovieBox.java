package com.root.moduledomain.moviebox;

import com.root.moduledomain.moviebox.dto.MovieBoxRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@Table(name = "movieBox")
@NoArgsConstructor
public class MovieBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movieId")
    private long movieId;

    @Column(name = "boxNumber")
    private long boxNumber;

    public MovieBox(MovieBoxRequestDto movieBoxRequestDto) {
        this.movieId = movieBoxRequestDto.getMovieId();
        this.boxNumber = movieBoxRequestDto.getBoxNumber();
        this.id = movieBoxRequestDto.getId();
    }
}
