package com.example.springMVC.dao;
import com.example.springMVC.models.Role;
import com.example.springMVC.models.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Set;

public interface UserDao {

    public List<User> getAllUsers();

    public User getUser(int id);

    public void save(User user);

    public void update(int id, User updatedUser);

    public void delete(int id);

    User getUserByName(String s);

}

