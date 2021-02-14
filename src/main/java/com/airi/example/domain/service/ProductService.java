package com.airi.example.domain.service;

import com.airi.example.domain.dao.ProductRepository;
import com.airi.example.domain.dto.ProductReqDto;
import com.airi.example.domain.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional
    public Product readService(int id){
        return repository.findById(id).get();
    }

    @Transactional
    public List<Product> readAllService(){
        return repository.findAll();
    }

    @Transactional
    public Product createService(ProductReqDto request){
        Product product = request.toEntity();
        return repository.save(product);
    }
}
