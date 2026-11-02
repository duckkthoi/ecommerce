package com.uthiduck.ecommerce.service;

import com.uthiduck.ecommerce.response.SignupRequest;

public interface AuthService {

    String createUser(SignupRequest req);
}
