package com.curriculo.cvwiki.cvwiki_backend.dto;

import com.curriculo.cvwiki.cvwiki_backend.entity.CurriculoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurriculoDTO {

    private Long id;
    private String url_foto_pessoal;
    private String cpf;
    private Date data_de_nascimento;

    public CurriculoDTO(CurriculoEntity curriculo){
        BeanUtils.copyProperties(curriculo, this);
    }
}
