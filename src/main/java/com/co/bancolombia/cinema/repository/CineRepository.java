package com.co.bancolombia.cinema.repository;

import com.co.bancolombia.cinema.models.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CineRepository  extends CrudRepository<Cine, UUID> {
}
