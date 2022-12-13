package com.odev.sale.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odev.sale.entities.concretes.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
