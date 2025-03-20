package com.hanghe.redis.movie

import com.hanghe.redis.movie.response.GetMovieScreeningResponses
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/movies")
class MovieControllerV1(
    private val service: MovieService
) {

    @GetMapping
    fun getAllScreeningMovies(): ResponseEntity<GetMovieScreeningResponses> {
        return ResponseEntity.ok(
            service.getAllScreeningMovies()
        )
    }
}
