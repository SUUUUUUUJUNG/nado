package com.nado.service;

import com.nado.dto.UserCreateRequestDTO;
import com.nado.entity.User;
import com.nado.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }


    public User update(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByEmail(String username) {
        return userRepository.findByEmail(username);
    }
}
