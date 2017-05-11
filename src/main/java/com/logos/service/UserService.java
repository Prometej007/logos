package com.logos.service;

import com.logos.entity.User;

import java.util.List;

/**
 * Created by danul on 11.05.2017.
 */
public interface UserService {
    List<User> findAll();

    User findOne(int id);

    void delete(int id);

    void save(User user);


}
