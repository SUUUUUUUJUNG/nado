package com.nado.controller.api;

import com.nado.dto.UserCreateRequestDTO;
import com.nado.entity.User;
import com.nado.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserAPIController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(UserCreateRequestDTO userCreateRequestDTO) {
        System.out.println("userCreateRequestDTO = " + userCreateRequestDTO);
        User user = new User(userCreateRequestDTO);
        System.out.println("user = " + user);
        userService.save(user);
        return ResponseEntity.ok().build();
    }
}
