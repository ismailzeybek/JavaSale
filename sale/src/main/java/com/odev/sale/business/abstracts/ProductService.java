package com.odev.sale.business.abstracts;

import java.util.List;

import com.odev.sale.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();

}
