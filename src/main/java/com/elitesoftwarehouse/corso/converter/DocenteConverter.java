package com.elitesoftwarehouse.corso.converter;

import com.elitesoftwarehouse.corso.dto.DocenteDTO;
import com.elitesoftwarehouse.corso.entity.Docente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DocenteConverter {

    public DocenteDTO convertToDTO(Docente docente) {
        DocenteDTO docenteDTO = new DocenteDTO();
        docenteDTO.setNome(docente.getNome());
        return docenteDTO;
    }

    public Docente convertToEntity(DocenteDTO docenteDTO) {
        Docente docente = new Docente();
        docente.setNome(docenteDTO.getNome());
        return docente;
    }

    public List<DocenteDTO> convertToDTOList(List<Docente> docenteList) {
        List<DocenteDTO> docenteDTOS = new ArrayList<>();
        for (Docente docente : docenteList) {
            DocenteDTO docenteDTO = convertToDTO(docente);
            docenteDTOS.add(docenteDTO);
        }
        return docenteDTOS;
    }

}
