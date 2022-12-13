package com.odev.sale.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odev.sale.business.abstracts.ProductService;
import com.odev.sale.dataAccess.abstracts.ProductRepository;
import com.odev.sale.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	private ProductRepository _productRepository;
	
	@Autowired
	public ProductManager(ProductRepository productRepository) {
		super();
		this._productRepository = productRepository;
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this._productRepository.findAll();
	}

}
