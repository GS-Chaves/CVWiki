package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.ExpProfissionalDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.ExpProfissionalEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.ExpProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpProfissionalService {

    @Autowired
    private ExpProfissionalRepository expProfissionalRepository;

    public List<ExpProfissionalDTO> ListaExpProfissional(){
        List<ExpProfissionalEntity> expProfissionais = expProfissionalRepository.findAll();
        return expProfissionais.stream().map(ExpProfissionalDTO::new).toList();
    }

    public void SalvarExpProfissional(ExpProfissionalDTO expProfissionalDTO) {
        ExpProfissionalEntity expProfissionalEntity = new ExpProfissionalEntity(expProfissionalDTO);
        expProfissionalRepository.save(expProfissionalEntity);
    }

    public ExpProfissionalDTO AtualizarExpProfissional(ExpProfissionalDTO expProfissionalDTO) {
        ExpProfissionalEntity expProfissional = new ExpProfissionalEntity(expProfissionalDTO);
        return new ExpProfissionalDTO(expProfissionalRepository.save(expProfissional));
    }

    public void ExcluirExpProfissional(Long id) {
        ExpProfissionalEntity expProfissional = expProfissionalRepository.findById(id).get();
        expProfissionalRepository.delete(expProfissional);
    }

    public ExpProfissionalDTO ConsultarExpProfissional(Long id) {
        ExpProfissionalEntity expProfissional = expProfissionalRepository.findById(id).get();
        return new ExpProfissionalDTO(expProfissional);
    }
}
