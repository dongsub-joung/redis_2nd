package com.root.moduleapplication.movie.repository;

import com.root.moduledomain.movie.Movie;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@EntityScan(basePackages = {"com.root.moduledomain.movie"})
public interface MovieRepository extends JpaRepository<Movie, Long> {

////    1주차 구현 과제
//    Optional<List<Movie>> findAllByOrderByReleaseDateDesc();
//
////    2주차 구현 과제
//    Optional<List<Movie>> findAllByTitle(String title);
//    Optional<List<Movie>> findAllByThemas(String themas);
}
