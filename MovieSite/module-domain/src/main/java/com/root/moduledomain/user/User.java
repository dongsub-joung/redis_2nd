package com.root.moduledomain.user;

import com.root.moduledomain.movie.Movie;
import com.root.moduledomain.movie.dto.MovieRequestDto;
import com.root.moduledomain.user.dto.UserRequestDto;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Movie> movies= new ArrayList<>();

    @Column(name = "positions")
    private String positions;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "guessted")
    private Boolean guessed = false;

    public User(UserRequestDto user) {
        this.movies = new ArrayList<>();
        this.positions = user.getPositions();
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.guessed = user.getGuessed();
    }
}



