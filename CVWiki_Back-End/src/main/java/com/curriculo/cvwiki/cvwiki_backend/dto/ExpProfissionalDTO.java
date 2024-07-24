package com.curriculo.cvwiki.cvwiki_backend.dto;

import com.curriculo.cvwiki.cvwiki_backend.entity.ExpProfissionalEntity;
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
public class ExpProfissionalDTO {

    private Long id;
    private String nome_empresa;
    private Date data_inicio;
    private Date data_termino;
    private Boolean status_exp_profissional;

    public ExpProfissionalDTO(ExpProfissionalEntity expProfissional){
        BeanUtils.copyProperties(expProfissional, this);
    }
}
