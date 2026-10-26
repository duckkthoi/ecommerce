package com.uthiduck.ecommerce.repository;

import com.uthiduck.ecommerce.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
