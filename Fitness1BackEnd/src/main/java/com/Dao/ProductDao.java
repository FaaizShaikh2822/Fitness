package com.Dao;

import java.util.List;

import com.model.Product;

public interface ProductDao 
{
	public boolean addProduct(Product product);
	
	public boolean deleteProduct(Product product);
	
	public List<Product> retrieveProducts();
	
	public Product getProduct(int ProductId);

}
