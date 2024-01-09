package com.example.NotesProject.service;

import com.example.NotesProject.entity.User;

public interface UserService {

    public User saveUser(User user);

    public boolean existEmailCheck(String email);

}