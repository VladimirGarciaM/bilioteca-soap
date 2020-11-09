package com.ixcorp.app.bibliotecasoap.repository;

import com.ixcorp.app.bibliotecasoap.domain.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibroRepository extends JpaRepository<LibroEntity,Long> {
}
