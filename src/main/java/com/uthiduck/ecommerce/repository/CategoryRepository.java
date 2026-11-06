package com.uthiduck.ecommerce.repository;

import com.uthiduck.ecommerce.modal.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryId(String categoryId);
}
