package edu.miu.ea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.ea.model.User;
import edu.miu.ea.repository.UserRepo;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

}
