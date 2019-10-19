package com.tommi.repo.spring.boot.h2.service;

import com.tommi.repo.spring.boot.h2.domain.User;
import com.tommi.repo.spring.boot.h2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    @Transactional
    public User getById(Long id){
        return userRepository.findById(id).get();
    }

    @Transactional
    public void saveUser(User user){
        userRepository.save(user);
    }

    @Transactional
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
