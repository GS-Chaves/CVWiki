package com.curriculo.cvwiki.cvwiki_backend.repository;

import com.curriculo.cvwiki.cvwiki_backend.entity.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
}
