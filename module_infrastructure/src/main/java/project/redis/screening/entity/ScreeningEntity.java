package project.redis.screening.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.redis.cinema.entity.CinemaEntity;
import project.redis.movie.entity.MovieEntity;

@Entity
@Table(name = "screening")
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ScreeningEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long screeningId;

    @Column(nullable = false)
    private LocalDateTime screeningStartTime;

    @Column(nullable = false)
    private LocalDateTime screeningEndTime;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)  // 영화와의 관계 설정
    private MovieEntity movie;

    @ManyToOne
    @JoinColumn(name = "cinema_id", nullable = false)  // 영화관과의 관계 설정
    private CinemaEntity cinema;
}
