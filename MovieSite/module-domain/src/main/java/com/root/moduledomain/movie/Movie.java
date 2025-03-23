package com.root.moduledomain.movie;

import com.root.moduledomain.common.Timestamped;
import com.root.moduledomain.position.Position;
import com.root.moduledomain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.root.moduleapplication.dto;

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

    @OneToMany
    private List<Position> positions = new ArrayList<>();

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

    public Movie(Movie movieRequestDto) {
        this.title = movieRequestDto.getTitle();
        this.description = movieRequestDto.getDescription();
        this.releaseDate = movieRequestDto.getReleaseDate();
        this.duration = movieRequestDto.getDuration();
        this.imgUrl = movieRequestDto.getImgUrl();
        this.position = movieRequestDto.getPosition();
        this.user = movieRequestDto.getUser();
    }
}

