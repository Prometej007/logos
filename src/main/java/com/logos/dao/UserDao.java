package com.logos.dao;

import com.logos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by danul on 11.05.2017.
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
