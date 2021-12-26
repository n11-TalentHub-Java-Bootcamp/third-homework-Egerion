package com.webservice.springwebapp.mongodb.controller;

import com.webservice.springwebapp.mongodb.entity.ProductComment;
import com.webservice.springwebapp.mongodb.entity.User;
import com.webservice.springwebapp.mongodb.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product-comment")
public class ProductCommentController {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    @GetMapping("")
    public List<ProductComment> findAll(){
        return productCommentEntityService.findAll();
    }

    @GetMapping("/id/{userId}")
    public ProductComment findById(@PathVariable String userId){
        return productCommentEntityService.findById(userId);
    }

    @PostMapping("")
    public ProductComment save(@PathVariable ProductComment productComment){
        return productCommentEntityService.save(productComment);
    }

    @DeleteMapping("delete/{userId}")
    public void deleteById(@PathVariable String userId){
        productCommentEntityService.deleteById(userId);
    }
}
