package com.curriculo.cvwiki.cvwiki_backend.entity;

import com.curriculo.cvwiki.cvwiki_backend.dto.PaisDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "CVW_PAIS")
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome_pais;

    public PaisEntity(PaisDTO pais){
        BeanUtils.copyProperties(pais, this);
    }
}
