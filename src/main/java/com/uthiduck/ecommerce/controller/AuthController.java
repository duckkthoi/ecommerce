package com.uthiduck.ecommerce.controller;

import com.uthiduck.ecommerce.domain.USER_ROLE;
import com.uthiduck.ecommerce.modal.User;
import com.uthiduck.ecommerce.repository.UserRepository;
import com.uthiduck.ecommerce.response.AuthResponse;
import com.uthiduck.ecommerce.response.SignupRequest;
import com.uthiduck.ecommerce.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;
    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody SignupRequest req){
        String jwt = authService.createUser(req);

        AuthResponse res = new AuthResponse();
        res.setJwt(jwt);
        res.setMessage("register success");
        res.setRole(USER_ROLE.ROLE_CUSTOMER);

        return ResponseEntity.ok(res);
    }
}
