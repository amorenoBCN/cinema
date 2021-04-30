package com.co.bancolombia.cinema.controller;

import com.co.bancolombia.cinema.models.Cine;
import com.co.bancolombia.cinema.repository.CineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CineController {

    @Autowired
    private CineService cineService;

    @GetMapping("/get-cines")
    private ResponseEntity<List<Cine>> findAllCines(){
        return ResponseEntity.ok().body(cineService.getAllCine());
    }


    @PostMapping("/create-cine")
    private ResponseEntity<Cine> createCine(@RequestBody Cine cine ){
        return cineService.createCine(cine);
    }

}
