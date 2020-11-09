package com.ixcorp.app.bibliotecasoap.service;

import com.ixcorp.app.bibliotecasoap.domain.AutorEntity;
import com.ixcorp.app.bibliotecasoap.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<AutorEntity> listAllAutor() {
        try {

            return autorRepository.findAll();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public AutorEntity crearAutor(AutorEntity entity) {
        try {

            return autorRepository.save(entity);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }

    }
}
