package com.example.polls.repository;

import com.example.polls.model.Product;

import com.example.polls.security.CurrentUser;
import com.example.polls.security.UserPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<Product> findById(long id);
    Optional<Product> findByName(String name);

    Boolean existsByName(String name);


}
