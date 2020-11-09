package com.ixcorp.app.bibliotecasoap.endpoint;

import com.ixcorp.app.bibliotecasoap.domain.AutorEntity;
import com.ixcorp.app.bibliotecasoap.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.com.ixcorp.biblioteca_soap.autor.AddAutorRequest;
import pe.com.ixcorp.biblioteca_soap.autor.AddAutorResponse;
import pe.com.ixcorp.biblioteca_soap.autor.Autor;
import pe.com.ixcorp.biblioteca_soap.autor.GetAllAutorResponse;


import java.util.ArrayList;
import java.util.List;

@Endpoint
public class AutorEndPoint {

    @Autowired
    private AutorService autorService;


    @PayloadRoot(namespace = "http://ixcorp.com.pe/biblioteca-soap/listAutor", localPart = "getAllAutorRequest")
    @ResponsePayload
    public GetAllAutorResponse getAllAutorResponse() {
        GetAllAutorResponse response = new GetAllAutorResponse();

        List<Autor> autorType = new ArrayList<>();

        List<AutorEntity> autorEntityList = autorService.listAllAutor();
        for (AutorEntity autorEntity : autorEntityList) {
            Autor autor = new Autor();
            autor.setAutorId(autorEntity.getAutorId());
            autor.setNombre(autorEntity.getNombres());
            autor.setApellidos(autorEntity.getApellidos());
            autorType.add(autor);
        }

        response.getAutorType().addAll(autorType);

        return response;
    }

    @PayloadRoot(namespace = "http://ixcorp.com.pe/biblioteca-soap/addAutor", localPart = "addAutorRequest")
    @ResponsePayload
    public AddAutorResponse addAutor(@RequestPayload AddAutorRequest request) {
        AddAutorResponse response = new AddAutorResponse();
        AutorEntity newAutorEntity = new AutorEntity();
        newAutorEntity.setAutorId(request.getAutorId());
        newAutorEntity.setNombres(request.getNombre());
        newAutorEntity.setApellidos(request.getApellidos());

        autorService.crearAutor(newAutorEntity);

        return response;

    }
}
