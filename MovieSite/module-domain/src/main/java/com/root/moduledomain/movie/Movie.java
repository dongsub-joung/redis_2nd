package com.root.moduledomain.movie;

import com.root.moduledomain.common.Timestamped;
import com.root.moduledomain.movie.dto.MovieRequestDto;
import com.root.moduledomain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import java.time.LocalDate;

@Entity
@Getter
@Table(name = "movies")
@NoArgsConstructor
public class Movie extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private GenreEnum genre;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "img_url")
    private String imgUrl;

    public Movie(MovieRequestDto movieRequestDto) {
        this.title = movieRequestDto.getTitle();
        this.description = movieRequestDto.getDescription();
        this.releaseDate = movieRequestDto.getReleaseDate();
        this.duration = movieRequestDto.getDuration();
        this.imgUrl = movieRequestDto.getImgUrl();
        this.genre= movieRequestDto.getGenre();
    }
}

