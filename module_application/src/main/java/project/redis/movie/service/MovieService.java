package project.redis.movie.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.redis.movie.Movie;
import project.redis.movie.adapter.MovieAdapter;
import project.redis.movie.dto.NowPlayMovieDto;
import project.redis.screening.Screening;
import project.redis.screening.adapter.ScreeningAdapter;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieAdapter movieAdapter;
    private final ScreeningAdapter screeningAdapter;

    public List<NowPlayMovieDto> getNowPlayingMovies() {
        List<Movie> movies = movieAdapter.findMovies();
        List<Movie> nowPlayingMovies = findNowPlayingMovies(movies);

        // Movie에는 id가 없고 MovieEntity에는 id가 있으니 Movie -> MovieEntity로 할 수 없음
        // 이렇게 도메인 객체에 id가 없는 것이 맞는가?
        // id가 없으니 관련된 Screening을 찾으려고 할 때 이름을 또 추출하고 그 이름으로 찾고 해야 함

        List<NowPlayMovieDto> nowPlayMovieDtos = makeNowPlayingMoviesInfo(nowPlayingMovies);
        return nowPlayMovieDtos;
    }

    public List<Movie> findNowPlayingMovies(List<Movie> movies) {
        LocalDateTime today = LocalDateTime.now();

        return movies.stream()
                .filter(movie -> movie.isReleasedBefore(today))
                .sorted(Movie::compareReleaseDate)
                .collect(Collectors.toList());
    }

    public List<NowPlayMovieDto> makeNowPlayingMoviesInfo(List<Movie> movies) {
        List<NowPlayMovieDto> nowPlayMovieDtos = new ArrayList<>();
        for (Movie movie : movies) {
            // 영화 이름이 같을 수도 있지 않나...?
            List<Screening> movieAllScreening = screeningAdapter.findScreeningsByMovieName(movie.getMovieName());

            Map<String, List<Screening>> cinemaNameScreening = movieAllScreening.stream()
                    .collect(Collectors.groupingBy(Screening::getCinemaName));

            for (Map.Entry<String, List<Screening>> entry : cinemaNameScreening.entrySet()) {
                String cinemaName = entry.getKey();
                List<Screening> screenings = entry.getValue();
                NowPlayMovieDto nowPlayMovieDto = makeNowPlayMovieDto(movie, cinemaName, screenings);
                nowPlayMovieDtos.add(nowPlayMovieDto);
            }
        }
        return nowPlayMovieDtos;
    }


    public NowPlayMovieDto makeNowPlayMovieDto(Movie movie, String cinemaName, List<Screening> screenings) {
        return NowPlayMovieDto.builder()
                .movieName(movie.getMovieName())
                .movieRate(movie.getMovieRate().getMovieRateDescription())
                .movieReleaseDate(movie.getMovieReleaseDate())
                .movieThumbnailImage(movie.getMovieThumbnailImage())
                .movieRunningTime(movie.getMovieRunningTime())
                .movieGenre(movie.getMovieGenre().getMovieGenreDescription())
                .cinemaName(cinemaName)
                .screenings(screenings)
                .build();
    }

}
