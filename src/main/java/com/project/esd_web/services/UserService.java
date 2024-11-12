package com.project.esd_web.services;

import com.project.esd_web.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "John Doe","john@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Girish","girish@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Akshar","akshar@gmail.com"));
    }

    public List<User> getUsers() {
        return store;
    }
}