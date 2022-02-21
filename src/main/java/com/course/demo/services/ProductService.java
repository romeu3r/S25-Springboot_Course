package com.course.demo.services;

import com.course.demo.entities.Product;
import com.course.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository userRepository;

    public List<Product> findAll() {
        return userRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = userRepository.findById(id);
        return obj.get();
    }
}
