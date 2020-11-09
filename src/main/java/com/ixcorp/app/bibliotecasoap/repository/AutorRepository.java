package com.ixcorp.app.bibliotecasoap.repository;

import com.ixcorp.app.bibliotecasoap.domain.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity,Long> {
}
