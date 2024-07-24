package com.curriculo.cvwiki.cvwiki_backend.dto;

import com.curriculo.cvwiki.cvwiki_backend.entity.FormacaoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormacaoDTO {
    private Long id;

    private String curso;

    private String status_formacao;

    public FormacaoDTO(FormacaoEntity formacao){
        BeanUtils.copyProperties(formacao, this);
    }
}
