package com.co.bancolombia.cinema.serviceImplements;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.co.bancolombia.cinema.models.Cine;
import com.co.bancolombia.cinema.models.TypeMovie;
import com.co.bancolombia.cinema.repository.CineRepository;
import com.co.bancolombia.cinema.repository.CineService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class CineImplements implements CineService {

    @Autowired
    private CineRepository cineRepository;

    @Override
    public List<Cine> getAllCine() {
        return (List<Cine>) cineRepository.findAll();
    }

    @Override
    public ResponseEntity<Cine> createCine(Cine cine) {

        //Si existe en cine el tipo de pelicula en base de datos, lo omita o se lo asigna
        return ResponseEntity.ok().body(cineRepository.save(cine));
    }
}
