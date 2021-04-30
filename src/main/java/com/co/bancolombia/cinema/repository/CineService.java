package com.co.bancolombia.cinema.repository;

import com.co.bancolombia.cinema.models.Cine;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CineService {

    List<Cine> getAllCine();
    ResponseEntity<Cine> createCine(Cine cine);

}
