package com.root.moduledomain.thema;

import com.root.moduledomain.movie.Movie;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "themas")
@NoArgsConstructor
public class Thema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @todo UnsignedLong
    private long id;

    @ManyToOne(optional = false)
    @JoinTable(name = "movie-thema",
            joinColumns = @JoinColumn(name = "themas"),
            inverseJoinColumns = @JoinColumn(name = "thema_id")
    )
    private Movie movie;

    @Column
    private long themaTypeId;
}
