package com.elitesoftwarehouse.corso.repository;

import com.elitesoftwarehouse.corso.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocenteRepository extends JpaRepository<Docente, Long> {
    List<Docente> findByNome(String nome);
}
