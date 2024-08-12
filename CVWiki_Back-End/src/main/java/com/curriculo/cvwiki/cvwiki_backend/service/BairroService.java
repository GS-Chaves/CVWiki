package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.BairroDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.BairroEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    public List<BairroDTO> ListarBairro() {
        List<BairroEntity> bairros = bairroRepository.findAll();
        return bairros.stream().map(BairroDTO::new).toList();
    }

    public void CadastrarBairro(BairroDTO bairroDTO) {
        BairroEntity bairro = new BairroEntity(bairroDTO);
        bairroRepository.save(bairro);
    }

    public BairroDTO AtualizarBairro(BairroDTO bairroDTO) {
        BairroEntity bairro = new BairroEntity(bairroDTO);
        return new BairroDTO(bairroRepository.save(bairro));
    }

    public void ExcluirBairro(Long id) {
        BairroEntity bairro = bairroRepository.findById(id).get();
        bairroRepository.delete(bairro);
    }

    public BairroDTO ConsultarBairroId(Long id) {
        BairroEntity bairro = bairroRepository.findById(id).get();
        return new BairroDTO(bairro);
    }
}
