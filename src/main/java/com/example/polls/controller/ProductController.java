package com.example.polls.controller;

import com.example.polls.model.Poll;
import com.example.polls.model.Product;
import com.example.polls.payload.ApiResponse;
import com.example.polls.payload.PollRequest;
import com.example.polls.payload.PollResponse;
import com.example.polls.payload.VoteRequest;
import com.example.polls.security.CurrentUser;
import com.example.polls.security.UserPrincipal;
import com.example.polls.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping("/addProduct")
    @PreAuthorize("hasRole('ADMIN')")
    public  ResponseEntity<?> addProduct(@RequestBody Product product) {
        Product product1 = service.saveProduct(product);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{productId}")
                .buildAndExpand(product1.getId()).toUri();

        return ResponseEntity.created(location)
                .body(new ApiResponse(true, "Product Created Successfully"));
    }


    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/id")
    public Product findAllProductById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/name")
    public Product findAllProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/id")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }


}