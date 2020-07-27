//package com.example.polls.model;
//
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//
//import javax.persistence.*;
//import javax.validation.Valid;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "orders")
//@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="orderProducts")
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//    private String status;
//
//    @OneToMany(mappedBy = "pk.order")
//    @Valid
//    private List<OrderProduct> orderProducts = new ArrayList<>();
//
//    @Transient
//    public Double getTotalOrderPrice() {
//        double sum = 0D;
//        List<OrderProduct> orderProducts = getOrderProducts();
//        for (OrderProduct op : orderProducts) {
//            sum += op.getTotalPrice();
//        }
//
//        return sum;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public List<OrderProduct> getOrderProducts() {
//        return orderProducts;
//    }
//
//    public void setOrderProducts(List<OrderProduct> orderProducts) {
//        this.orderProducts = orderProducts;
//    }
//
//    @Transient
//    public int getNumberOfProducts() {
//        return this.orderProducts.size();
//    }
//}
