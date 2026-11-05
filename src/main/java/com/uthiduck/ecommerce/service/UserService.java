package com.uthiduck.ecommerce.service;

import com.uthiduck.ecommerce.modal.User;

public interface UserService {

    User findUserByJwtToken(String jwt) throws Exception;
    User findUserByEmail(String email) throws Exception;
}
