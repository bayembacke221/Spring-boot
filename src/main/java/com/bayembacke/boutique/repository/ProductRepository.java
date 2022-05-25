package com.bayembacke.boutique.repository;

import com.bayembacke.boutique.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository  extends JpaRepository<Product,Long> {
    Optional<Product>  findEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
