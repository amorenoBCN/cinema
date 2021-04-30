package com.co.bancolombia.cinema.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
@Table(schema = "schcinema")
public class TypeMovie {

    @Id
    @Column(name = "id_type_movie")
    private UUID idType;

    private String type;

}
