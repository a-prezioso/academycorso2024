package com.elitesoftwarehouse.corso.service;

import com.elitesoftwarehouse.corso.converter.DocenteConverter;
import com.elitesoftwarehouse.corso.dto.DocenteDTO;
import com.elitesoftwarehouse.corso.entity.Docente;
import com.elitesoftwarehouse.corso.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    @Autowired
    DocenteConverter docenteConverter;

    @Autowired
    private DocenteRepository docenteRepository;


    public Docente saveDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public List<DocenteDTO> getDocenti() {
        List<Docente> docenti = docenteRepository.findAll();
        List<DocenteDTO> docenteDTOS = docenteConverter.convertToDTOList(docenti);
        return docenteDTOS;
    }


    public List<Docente> findByNome(String nome) {
        List<Docente> docenti = docenteRepository.findByNome(nome);
        return docenti;
    }
}
