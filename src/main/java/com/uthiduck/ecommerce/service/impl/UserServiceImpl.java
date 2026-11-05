package com.uthiduck.ecommerce.service.impl;

import com.uthiduck.ecommerce.config.JwtProvider;
import com.uthiduck.ecommerce.modal.User;
import com.uthiduck.ecommerce.repository.UserRepository;
import com.uthiduck.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email = jwtProvider.getEmailFromJwtToken(jwt);

        return this.findUserByEmail(email);

    }

    @Override
    public User findUserByEmail(String email) throws Exception {
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new Exception("user not found with email - " + email);
        }
        return user;
    }
}
