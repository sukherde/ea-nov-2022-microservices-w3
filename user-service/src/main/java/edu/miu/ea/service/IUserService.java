package edu.miu.ea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.miu.ea.model.User;

@Service
public interface IUserService {
    List<User> getAllUsers();

    User getUserById(int id);
}
