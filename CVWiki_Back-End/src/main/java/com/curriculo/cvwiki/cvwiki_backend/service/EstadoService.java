package com.curriculo.cvwiki.cvwiki_backend.service;

import com.curriculo.cvwiki.cvwiki_backend.dto.EstadoDTO;
import com.curriculo.cvwiki.cvwiki_backend.entity.EstadoEntity;
import com.curriculo.cvwiki.cvwiki_backend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<EstadoDTO> ListarEstados() {
        List<EstadoEntity> estados = estadoRepository.findAll();
        return estados.stream().map(EstadoDTO::new).toList();
    }

    public void SalvarEstado(EstadoDTO estadoDTO) {
        EstadoEntity estado = new EstadoEntity(estadoDTO);
        estadoRepository.save(estado);
    }

    public EstadoDTO AtualizarEstado(EstadoDTO estadoDTO) {
        EstadoEntity estado = new EstadoEntity(estadoDTO);
        return new EstadoDTO(estadoRepository.save(estado));
    }

    public void ExcluirEstado(Long id) {
        EstadoEntity estado = estadoRepository.findById(id).get();
        estadoRepository.delete(estado);
    }

    public EstadoDTO ConsultarEstado(Long id) {
        EstadoEntity estado = estadoRepository.findById(id).get();
        return new EstadoDTO(estado);
    }
}
