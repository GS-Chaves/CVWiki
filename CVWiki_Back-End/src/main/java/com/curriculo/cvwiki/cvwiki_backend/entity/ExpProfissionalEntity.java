package com.curriculo.cvwiki.cvwiki_backend.entity;

import com.curriculo.cvwiki.cvwiki_backend.dto.ExpProfissionalDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "CVW_EXP-PROFISSIONAL")
public class ExpProfissionalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome_empresa;

    @Column
    @EqualsAndHashCode.Include
    private Date data_inicio;

    @Column
    @EqualsAndHashCode.Include
    private Date data_termino;

    @Column(nullable = false)
    private Boolean status_exp_profissional;

    public ExpProfissionalEntity(ExpProfissionalDTO expProfissional){
        BeanUtils.copyProperties(expProfissional, this);
    }
}
