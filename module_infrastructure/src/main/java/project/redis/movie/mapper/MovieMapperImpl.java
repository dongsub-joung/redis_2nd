package project.redis.movie.mapper;

import org.springframework.stereotype.Component;
import project.redis.movie.Movie;
import project.redis.movie.entity.MovieEntity;

@Component
public class MovieMapperImpl implements MovieMapper {
    @Override
    public Movie toDomain(MovieEntity movieEntity) {
        return Movie.of(movieEntity.getMovieName(), movieEntity.getMovieRate(), movieEntity.getMovieReleaseDate(),
                movieEntity.getMovieThumbnailImage(), movieEntity.getMovieRunningTime(), movieEntity.getMovieGenre());
    }
}
