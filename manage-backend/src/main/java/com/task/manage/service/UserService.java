package com.task.manage.service;

import com.task.manage.model.User;
import com.task.manage.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserInterface userInterface;

    @Autowired
    public UserService(UserInterface userInterface) {
        this.userInterface = userInterface;
    }
    public List<User> getAllUser() {
        return userInterface.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userInterface.findById(id);
    }

    public User createUser(User user) {
        return userInterface.save(user);
    }

    public void updateUser(User user){
        userInterface.save(user);
    }

    public void deleteUserById(Long id){
        userInterface.deleteById(id);
    }
}
