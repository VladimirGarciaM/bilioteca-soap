package com.ixcorp.app.bibliotecasoap.endpoint;

import com.ixcorp.app.bibliotecasoap.service.UserService;
import org.hibernate.usertype.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.com.ixcorp.biblioteca_soap.users.GetAllUserResponse;
import pe.com.ixcorp.biblioteca_soap.users.GetUserRequest;
import pe.com.ixcorp.biblioteca_soap.users.GetUserResponse;
import pe.com.ixcorp.biblioteca_soap.users.User;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class UserEndPoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://ixcorp.com.pe/biblioteca-soap/users", localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserResponse(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUsers(userService.getUsers(request.getName()));
        return response;
    }


    @PayloadRoot(namespace = "http://ixcorp.com.pe/biblioteca-soap/allUser", localPart = "getAllUserRequest")
    @ResponsePayload
    public GetAllUserResponse getAllUserResponse() {
        GetAllUserResponse response = new GetAllUserResponse();

        List<User> usersType = new ArrayList<>();

        List<User> userEntityList = userService.getAllEntities();
        for (User user:
                userEntityList) {
            usersType.add(user);
        }

        response.getUserType().addAll(usersType);

        return response;
    }


}
