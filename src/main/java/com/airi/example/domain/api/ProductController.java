package com.airi.example.domain.api;

import com.airi.example.domain.dto.ProductReqDto;
import com.airi.example.domain.entity.Product;
import com.airi.example.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    @ResponseBody
    public List<Product> getProducts(){
        return productService.readAllService();
    }

    @GetMapping(value = "/product/{id}")
    @ResponseBody
    public Product getProduct(@PathVariable("id")int id){
        return productService.readService(id);
    }

    @PostMapping(value = "/products")
    @ResponseBody
    public Product saveProduct(@RequestBody ProductReqDto request){
        return productService.createService(request);
    }



}
