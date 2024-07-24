package com.curriculo.cvwiki.cvwiki_backend.dto;

import com.curriculo.cvwiki.cvwiki_backend.entity.PaisEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaisDTO {

    private Long id;
    private String nome_pais;

    public PaisDTO(PaisEntity pais){
        BeanUtils.copyProperties(pais, this);
    }
}
