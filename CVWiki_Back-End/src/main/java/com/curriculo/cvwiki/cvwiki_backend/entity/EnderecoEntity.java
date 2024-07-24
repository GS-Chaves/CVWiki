package com.curriculo.cvwiki.cvwiki_backend.entity;

import com.curriculo.cvwiki.cvwiki_backend.dto.EnderecoDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "CVW_ENDERECO")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String rua;

    public EnderecoEntity(EnderecoDTO endereco){
        BeanUtils.copyProperties(endereco, this);
    }
}
