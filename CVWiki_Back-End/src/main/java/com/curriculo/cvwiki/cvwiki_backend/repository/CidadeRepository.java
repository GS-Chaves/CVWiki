package com.curriculo.cvwiki.cvwiki_backend.repository;

import com.curriculo.cvwiki.cvwiki_backend.entity.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeEntity, Long> {
}
