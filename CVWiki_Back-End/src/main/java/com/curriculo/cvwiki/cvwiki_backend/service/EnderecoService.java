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

    public void SalvarEndereco(EnderecoDTO enderecoDTO){
        EnderecoEntity endereco = new EnderecoEntity(enderecoDTO);
        enderecoRepository.save(endereco);
    }

    public EnderecoDTO AtualizarEndereco(EnderecoDTO enderecoDTO){
        EnderecoEntity endereco = new EnderecoEntity(enderecoDTO);
        return new EnderecoDTO(enderecoRepository.save(endereco));
    }

    public void ExcluirEndereco(Long id){
        EnderecoEntity endereco = enderecoRepository.findById(id).get();
        enderecoRepository.delete(endereco);
    }

    public EnderecoDTO ConsultarEnderecoPorId(Long id){
        EnderecoEntity endereco = enderecoRepository.findById(id).get();
        return new EnderecoDTO(endereco);
    }
}
