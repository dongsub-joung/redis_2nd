package com.root.moduledomain.movie;

import com.root.moduledomain.common.Timestamped;
import com.root.moduledomain.movie.dto.MovieRequestDto;
import com.root.moduledomain.position.Position;
import com.root.moduledomain.genre.Genre;
import com.root.moduledomain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "movies")
@NoArgsConstructor
public class Movie extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @todo UnsignedLong
    private long id;


    @Formula("(SELECT COUNT(*) FROM position WHERE position.movieId = id)")
    private List<Position> positions;

    @Enumerated(EnumType.STRING)
    private GenreEnum genre;

    @ManyToOne(optional = false)
    @JoinTable(name = "movies_userId",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
    )
    private User user;

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

    @Column(name = "position")
    private String position;

    public Movie(MovieRequestDto movieRequestDto) {
        this.title = movieRequestDto.getTitle();
        this.description = movieRequestDto.getDescription();
        this.releaseDate = movieRequestDto.getReleaseDate();
        this.duration = movieRequestDto.getDuration();
        this.imgUrl = movieRequestDto.getImgUrl();
        this.position = movieRequestDto.getPosition();
        this.user = new User(movieRequestDto.getUser());
        this.genres = new ArrayList<>();
    }
}

