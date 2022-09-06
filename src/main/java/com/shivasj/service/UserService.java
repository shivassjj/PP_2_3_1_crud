package com.shivasj.service;

import com.shivasj.model.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public void addUser(User user);

    public User showUser(int id);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
