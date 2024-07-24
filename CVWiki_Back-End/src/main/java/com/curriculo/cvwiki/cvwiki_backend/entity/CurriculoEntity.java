package com.curriculo.cvwiki.cvwiki_backend.entity;

import com.curriculo.cvwiki.cvwiki_backend.dto.CurriculoDTO;
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
@Table(name = "CVW_CURRICULO")
public class CurriculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String url_foto_pessoal;

    @Column(nullable = false, unique = true)
    @EqualsAndHashCode.Include
    private String cpf;

    @Column(nullable = false)
    private Date data_de_nascimento;

    public CurriculoEntity(CurriculoDTO curriculo){
        BeanUtils.copyProperties(curriculo, this);
    }
}
