package com.uthiduck.ecommerce.service;

import com.uthiduck.ecommerce.domain.USER_ROLE;
import com.uthiduck.ecommerce.request.LoginRequest;
import com.uthiduck.ecommerce.response.AuthResponse;
import com.uthiduck.ecommerce.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email, USER_ROLE role) throws Exception;

    String createUser(SignupRequest req) throws Exception;

    AuthResponse signing(LoginRequest req);
}
