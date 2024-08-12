package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.CurriculoDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.CurriculoEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public List<CurriculoDTO> ListaCurriculos() {
        List<CurriculoEntity> curriculos = curriculoRepository.findAll();
        return curriculos.stream().map(CurriculoDTO::new).toList();
    }

    public void SalvarCurriculo(CurriculoDTO curriculoDTO) {
        CurriculoEntity curriculo = new CurriculoEntity(curriculoDTO);
        curriculoRepository.save(curriculo);
    }

    public CurriculoDTO AtualizarCurriculo(CurriculoDTO curriculoDTO) {
        CurriculoEntity curriculo = new CurriculoEntity(curriculoDTO);
        return new CurriculoDTO(curriculoRepository.save(curriculo));
    }

    public void ExcluirCurriculo(Long id) {
        CurriculoEntity curriculo = curriculoRepository.findById(id).get();
        curriculoRepository.delete(curriculo);
    }

    public CurriculoDTO ConsultarCurriculo(Long id) {
        CurriculoEntity curriculo = curriculoRepository.findById(id).get();
        return new CurriculoDTO(curriculo);
    }
}
