package com.webservice.springwebapp.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document(collation = "productId")
public class ProductComment {

    @Id
    private String id;
    private String comment;
    private Date commentDate;
    private String productId;
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ProductComment{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                ", productId='" + productId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
