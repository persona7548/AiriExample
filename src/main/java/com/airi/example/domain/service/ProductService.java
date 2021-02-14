package com.airi.example.domain.service;

import com.airi.example.domain.dao.ProductRepository;
import com.airi.example.domain.dto.ProductReqDto;
import com.airi.example.domain.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Transactional
@Service
public class ProductService {

    private ProductRepository repository;

    ProductService(ProductRepository repository){this.repository =repository;}

    @Transactional
    public Product readService(int id){
        System.out.println(repository.findById(id).get());
        return repository.findById(id).get();
    }

    @Transactional
    public List<Product> readAllService(){
        System.out.println(repository.findAll());
        return repository.findAll();
    }

    @Transactional
    public Product createService(ProductReqDto request){
        Product product = request.toEntity();
        return repository.save(product);

    }
}
