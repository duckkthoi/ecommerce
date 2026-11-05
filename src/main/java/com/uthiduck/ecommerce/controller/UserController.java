package com.uthiduck.ecommerce.controller;

import com.uthiduck.ecommerce.domain.USER_ROLE;
import com.uthiduck.ecommerce.modal.User;
import com.uthiduck.ecommerce.response.AuthResponse;
import com.uthiduck.ecommerce.response.SignupRequest;
import com.uthiduck.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/profile")
    public ResponseEntity<User> createUserHandler(@RequestHeader("Authorization") String jwt) throws Exception {

        User user = userService.findUserByJwtToken(jwt);
        return ResponseEntity.ok(user);
    }
}
