package com.curriculo.cvwiki.cvwiki_backend.repository;

import com.curriculo.cvwiki.cvwiki_backend.entity.EstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoEntity, Long> {
}
