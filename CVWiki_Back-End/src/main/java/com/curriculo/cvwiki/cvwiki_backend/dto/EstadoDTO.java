package com.curriculo.cvwiki.cvwiki_backend.dto;

import com.curriculo.cvwiki.cvwiki_backend.entity.EstadoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstadoDTO {

    private Long id;
    private String nome_estado;

    public EstadoDTO(EstadoEntity estado){
        BeanUtils.copyProperties(estado, this);
    }
}
