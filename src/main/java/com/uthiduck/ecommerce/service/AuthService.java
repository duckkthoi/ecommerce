package com.uthiduck.ecommerce.service;

import com.uthiduck.ecommerce.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email) throws Exception;

    String createUser(SignupRequest req) throws Exception;
}
