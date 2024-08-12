package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.EnderecoDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.EnderecoEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoDTO> ListarEndereco(){
        List<EnderecoEntity> enderecos = enderecoRepository.findAll();
        return enderecos.stream().map(EnderecoDTO::new).toList();
    }

    //Continue...
}
