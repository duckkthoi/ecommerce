package com.uthiduck.ecommerce.controller;

import com.uthiduck.ecommerce.modal.User;
import com.uthiduck.ecommerce.repository.UserRepository;
import com.uthiduck.ecommerce.response.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;
    @PostMapping("/signup")
    public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req){
        User user = new User();
        user.setEmail(req.getEmail());
        user.setFullName(req.getFullName());

        User savedUser = userRepository.save(user);

        return ResponseEntity.ok(savedUser);
    }
}
