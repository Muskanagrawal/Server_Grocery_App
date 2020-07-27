package com.example.polls.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="product", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "name"
        })})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    @NotNull(message = "Product name is required.")
    private String name;


    private int quantity;


    private double price;

    @NotBlank
    private String pictureUrl;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "orders",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "order_id"))
//    private Set<Order> orders = new HashSet<>();

    public Product() {

    }

    public Product(Long id, @NotNull(message = "Product name is required.")String name, int quantity, double price,String pictureUrl) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.pictureUrl = pictureUrl;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public Set<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(Set<Order> orders) {
//        this.orders = orders;
//    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
