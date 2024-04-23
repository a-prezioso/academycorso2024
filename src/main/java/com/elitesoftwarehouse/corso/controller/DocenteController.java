package com.elitesoftwarehouse.corso.controller;

import com.elitesoftwarehouse.corso.dto.DocenteDTO;
import com.elitesoftwarehouse.corso.entity.Docente;
import com.elitesoftwarehouse.corso.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docente")
public class DocenteController {


    @Autowired
    private DocenteService docenteService;


    @PostMapping("/salva")
    public Docente createDocente(@RequestBody Docente docente) {
        return docenteService.saveDocente(docente);
    }

    @GetMapping("/lista")
    public List<DocenteDTO> getDocenti() {
        return docenteService.getDocenti();
    }


    @GetMapping("/findByNomeRequestParam")
    public List<Docente> findByNome1(@RequestParam String nome, @RequestParam String cognome) {
        System.out.println(cognome);
        return docenteService.findByNome(nome);
    }

    @GetMapping("/findByNomePathVariable/{nome}/{cognome}")
    public List<Docente> findByNome2(@PathVariable String nome) {
        return docenteService.findByNome(nome);
    }

}
