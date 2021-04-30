package com.co.bancolombia.cinema.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
@Table(schema = "schcinema")
public class Movie {

    @Id
    @Column(name = "id_movie")
    private UUID idMovie;

    private String name;
    private LocalDate date;
    private int duration;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_type_movie")
    private TypeMovie type;


}
