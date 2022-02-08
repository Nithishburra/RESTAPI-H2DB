package com.Test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Test.binding.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
