package com.bayembacke.boutique.service;

import com.bayembacke.boutique.exception.ProductNotFoundException;
import com.bayembacke.boutique.model.Product;
import com.bayembacke.boutique.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){

        this.productRepository=productRepository;

    }
    public Product addProduct(Product product){

        return productRepository.save(product);

    }
    public List<Product> findAllProduct(){

        return  productRepository.findAll();

    }
    public Product updateProduct(Product product){

        return productRepository.save(product);

    }
    public  void  deleteProduct(Long id){
        productRepository.deleteEmployeeById(id);
    }
    public  Product findById(Long id){
        return  productRepository.findEmployeeById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product by id " + id + " was not found"));
    }
}
