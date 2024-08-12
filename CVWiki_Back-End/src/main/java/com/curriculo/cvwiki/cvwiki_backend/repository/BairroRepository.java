package com.curriculo.cvwiki.cvwiki_backend.repository;

import com.curriculo.cvwiki.cvwiki_backend.entity.BairroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<BairroEntity, Long> {
}
