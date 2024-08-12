package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.CidadeDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.CidadeEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<CidadeDTO> ListarCidades() {
        List<CidadeEntity> cidades = cidadeRepository.findAll();
        return cidades.stream().map(CidadeDTO::new).toList();
    }

    public void SalvarCidade(CidadeDTO cidadeDTO) {
        CidadeEntity cidade = new CidadeEntity(cidadeDTO);
        cidadeRepository.save(cidade);
    }

    public CidadeDTO AtualizarCidade(CidadeDTO cidadeDTO) {
        CidadeEntity cidade = new CidadeEntity(cidadeDTO);
        return new CidadeDTO(cidadeRepository.save(cidade));
    }

    public void ExcluirCidade(Long id) {
        CidadeEntity cidade = cidadeRepository.findById(id).get();
        cidadeRepository.delete(cidade);
    }

    public CidadeDTO ConsultarCidade(Long id) {
        CidadeEntity cidade = cidadeRepository.findById(id).get();
        return new CidadeDTO(cidade);
    }
}
