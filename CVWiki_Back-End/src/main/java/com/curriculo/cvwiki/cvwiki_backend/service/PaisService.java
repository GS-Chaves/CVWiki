package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.PaisDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.PaisEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<PaisDTO> ListarPais() {
        List<PaisEntity> paises = paisRepository.findAll();
        return paises.stream().map(PaisDTO::new).toList();
    }

    public void CadastrarPais(PaisDTO paisDTO) {
        PaisEntity pais = new PaisEntity(paisDTO);
        paisRepository.save(pais);
    }

    public PaisDTO AtualizarPais(PaisDTO paisDTO) {
        PaisEntity pais = new PaisEntity(paisDTO);
        return new PaisDTO(paisRepository.save(pais));
    }

    public void ExcluirPais(Long id) {
        PaisEntity pais = paisRepository.findById(id).get();
        paisRepository.delete(pais);
    }

    public PaisDTO ConsultarPaisPorId(Long id) {
        PaisEntity pais = paisRepository.findById(id).get();
        return new PaisDTO(pais);
    }
}
