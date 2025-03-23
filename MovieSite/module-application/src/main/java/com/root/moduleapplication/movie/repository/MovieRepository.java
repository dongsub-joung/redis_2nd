package com.root.moduleapplication.movie.repository;

import com.root.moduledomain.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
