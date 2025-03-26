package com.root.moduleapplication.movie.controller;


import com.root.moduledomain.movie.dto.MovieResponseDto;
import com.root.moduleapplication.movie.service.MovieServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private MovieServiceImpl movieServiceimpl;

    //    API 1개
    @GetMapping("/movie")
//    메인 페이지는 ‘개봉일’ 순서로 정렬되어야 합니다. 또한 시간표는 그림과 같이 시작시간이 빠른 것부터 정렬되어야 합니다.
    public List<MovieResponseDto> getMovies(){
        return movieServiceimpl.findAll();
    }
}

