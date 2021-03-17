package com.caputo.devSuperiorJPA1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caputo.devSuperiorJPA1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
