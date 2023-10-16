package com.ElRistorante.LaCarta.Repository;

import com.ElRistorante.LaCarta.Entity.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
}
