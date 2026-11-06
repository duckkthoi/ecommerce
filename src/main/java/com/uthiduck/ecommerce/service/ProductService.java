package com.uthiduck.ecommerce.service;

import com.uthiduck.ecommerce.exceptions.ProductException;
import com.uthiduck.ecommerce.modal.Product;
import com.uthiduck.ecommerce.modal.Seller;
import com.uthiduck.ecommerce.request.CreateProductRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    public Product createProduct(CreateProductRequest req, Seller seller);
    public void deleteProduct(Long productId) throws ProductException;
    public Product updateProduct(Long productId, Product product) throws ProductException;
    Product findProductById(Long productId) throws ProductException;
    List<Product> searchProducts();
    public Page<Product> getAllProducts(
            String category,
            String brand,
            String colors,
            String sizes,
            Integer minPrice,
            Integer maxPrice,
            Integer minDiscount,
            String sort,
            String stock,
            Integer pageNumber
    );
    List<Product> getProductBySellerId(Long sellerId);
}
