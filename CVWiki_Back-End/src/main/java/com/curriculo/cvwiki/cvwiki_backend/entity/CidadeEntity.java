package com.curriculo.cvwiki.cvwiki_backend.entity;

import com.curriculo.cvwiki.cvwiki_backend.dto.CidadeDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "CVW_CIDADE")
public class CidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome_cidade;

    public CidadeEntity(CidadeDTO cidade){
        BeanUtils.copyProperties(cidade, this);
    }
}
