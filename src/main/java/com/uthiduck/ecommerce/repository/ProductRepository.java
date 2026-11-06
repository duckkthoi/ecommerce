package com.uthiduck.ecommerce.repository;

import com.uthiduck.ecommerce.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
