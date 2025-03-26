package com.root.moduleapplication.movie.repository;

import com.root.moduledomain.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Override
    List<Movie> findAll();

    @Override
    Optional<Movie> findById(Long aLong);

//    1주차 구현 과제
    Optional<List<Movie>> findAllByOrderByReleaseDateDesc();

//    2주차 구현 과제
    Optional<List<Movie>> findAllByTitle(String title);
    Optional<List<Movie>> findAllByThemas(String themas);
}
