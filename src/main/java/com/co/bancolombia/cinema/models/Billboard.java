package com.co.bancolombia.cinema.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
@Table(schema = "schcinema")
public class Billboard {

    @Id
    @Column(name = "id_billboard")
    private UUID idBillboard;

    private LocalDate date;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_movie")
    private List<Movie> movies;


}
