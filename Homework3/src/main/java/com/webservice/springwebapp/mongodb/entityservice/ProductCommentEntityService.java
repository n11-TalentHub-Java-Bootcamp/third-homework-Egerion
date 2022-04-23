package com.webservice.springwebapp.mongodb.entityservice;

import com.webservice.springwebapp.mongodb.entity.ProductComment;
import com.webservice.springwebapp.mongodb.entity.User;
import com.webservice.springwebapp.mongodb.repository.ProductCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentRepository productCommentRepository;

    public List<ProductComment> findAll(){
        return productCommentRepository.findAll();
    }

    public ProductComment findById(String id){
        Optional<ProductComment> optional = productCommentRepository.findById(id);
        ProductComment productComment = null;
        if(optional.isPresent()){
            productComment = optional.get();
        }
        return productComment;
    }

    public ProductComment save(ProductComment productComment){
        return productCommentRepository.save(productComment);
    }

    public void deleteById(String id){
        productCommentRepository.deleteById(id);
    }
}
