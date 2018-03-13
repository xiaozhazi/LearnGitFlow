package com.frances.thymeleafdemo.service;

import com.frances.thymeleafdemo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();
    public User findUserById(long id);
    public void save(User user);
    public void edit(User user);
    public void delete(User user);
}
