package com.co.bancolombia.cinema.models;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
@Table(schema = "schcinema")
public class Cine {

    @Id
    @Column(name = "id_cine")
    private UUID id;

    private String name;
    private String address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_billboard")
    private Billboard billboard;


}
