package com.webservice.springwebapp.mongodb.repository;

import com.webservice.springwebapp.mongodb.entity.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCommentRepository extends MongoRepository<ProductComment, String> {
}
