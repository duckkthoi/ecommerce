package com.uthiduck.ecommerce.repository;

import com.uthiduck.ecommerce.domain.AccountStatus;
import com.uthiduck.ecommerce.modal.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Seller findByEmail(String email);
    List<Seller> findByAccountStatus(AccountStatus status);
}
