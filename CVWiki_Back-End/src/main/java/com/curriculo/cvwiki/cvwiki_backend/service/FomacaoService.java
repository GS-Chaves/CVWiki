package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.FormacaoDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.FormacaoEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.FormacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FomacaoService {

    @Autowired
    private FormacaoRepository formacaoRepository;

    public List<FormacaoDTO> ListarFormacao() {
        List<FormacaoEntity> formacoes = formacaoRepository.findAll();
        return formacoes.stream().map(FormacaoDTO::new).toList();
    }

    public void SalvarFormacao(FormacaoDTO formacaoDTO) {
        FormacaoEntity formacao = new FormacaoEntity(formacaoDTO);
        formacaoRepository.save(formacao);
    }

    public FormacaoDTO AtualizarFormacao(FormacaoDTO formacaoDTO) {
        FormacaoEntity formacao = new FormacaoEntity(formacaoDTO);
        return new FormacaoDTO(formacaoRepository.save(formacao));
    }

    public void ExcluirFormacao(Long id) {
        FormacaoEntity formacao = formacaoRepository.findById(id).get();
        formacaoRepository.delete(formacao);
    }

    public FormacaoDTO BuscarFormacao(Long id) {
        FormacaoEntity formacao = formacaoRepository.findById(id).get();
        return new FormacaoDTO(formacao);
    }
}
