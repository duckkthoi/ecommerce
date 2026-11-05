package com.uthiduck.ecommerce.repository;

import com.uthiduck.ecommerce.modal.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
