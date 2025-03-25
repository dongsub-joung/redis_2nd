package com.root.moduleapplication.movie.service;

import com.root.moduleapplication.movie.dto.MovieRequestDto;
import com.root.moduleapplication.movie.dto.MovieResponseDto;
import com.root.moduleapplication.movie.repository.MovieRepository;
import com.root.moduledomain.movie.Movie;
import exception.NullCheckException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MovieServiceImpl {

    private final MovieRepository movieRepository;

    @Transactional
    public Movie save(MovieRequestDto movieRequestDto) {
        return movieRepository.save(new Movie(movieRequestDto));
    }
    @Transactional
    public void delete(MovieRequestDto movieRequestDto) {
        movieRepository.delete(new Movie(movieRequestDto));
    }

    public MovieResponseDto findById(Long id) {
        Movie moive= movieRepository.findById(id).orElse(null);
        return new MovieResponseDto(moive);
    }

    //    메인 페이지는 ‘개봉일’ 순서로 정렬되어야 합니다. 또한 시간표는 그림과 같이 시작시간이 빠른 것부터 정렬되어야 합니다.
    public List<MovieResponseDto> findAll() {
        List<Movie> movieList= movieRepository.findAll();
        List<MovieResponseDto> movieResponseDtoList= new ArrayList<>();
        for (Movie movie : movieList) {
            movieResponseDtoList.add(new MovieResponseDto(movie));
        }

        try {
            if(movieResponseDtoList.size()>0) {
                return movieResponseDtoList;
            }else{
                throw new NullCheckException("Movie list is empty");
            }
        }catch (NullCheckException e){
            e.printStackTrace();
        }

    }

}