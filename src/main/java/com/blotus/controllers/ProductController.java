package com.blotus.controllers;

import com.blotus.domain.ProductModel;
import com.blotus.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/12.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public Iterable<ProductModel> getList(){
        return this.repository.findAll();
    }

    @PostMapping("/product/add")
    public void add(){
        ProductModel p = new ProductModel();
        p.setId(1);
        p.setProductName("abcd");
        p.setDescription("测试数据库");
        this.repository.save(p);
    }
}
