package com.ixcorp.app.bibliotecasoap.service;

import org.springframework.stereotype.Service;
import pe.com.ixcorp.biblioteca_soap.users.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User user = new User();
        user.setEmployeeId(1);
        user.setName("Jedion");
        user.setSalary(555.5);

        users.put(user.getName(), user);

        user = new User();
        user.setEmployeeId(1);
        user.setName("Maria");
        user.setSalary(555.5);
        users.put(user.getName(), user);
    }

    public User getUsers(String name) {
        return users.get(name);
    }

    public List<User> getAllEntities() {
        List<User> list = new ArrayList<>();

        User user = new User();
        user.setEmployeeId(1);
        user.setName("Jedion");
        user.setSalary(555.5);
        list.add(user);

        user = new User();
        user.setEmployeeId(1);
        user.setName("Maria");
        user.setSalary(555.5);
        list.add(user);
        return list;
    }
}
