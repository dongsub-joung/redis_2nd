package com.root.moduledomain.user;

import com.root.moduledomain.movie.Movie;
import com.root.moduledomain.movie.dto.MovieRequestDto;
import com.root.moduledomain.user.dto.UserRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movieId")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "guessted")
    private Boolean guessed = false;

    public User(UserRequestDto user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.guessed = user.getGuessed();
    }
}



