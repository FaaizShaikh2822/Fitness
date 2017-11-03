package com.niit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.ProductDao;
import com.model.Product;

public class ProductDaoTest 
{
	static ProductDao productDao;
	
	@BeforeClass
	public static void Initialize()
	{
		AnnotationConfigApplicationContext configApplnContext = new AnnotationConfigApplicationContext();
		configApplnContext.scan("com");
		configApplnContext.refresh();
		
		productDao = (ProductDao) configApplnContext.getBean("productDao");
		
	}
	
	@Test
	public void addProductTest()
	{
		Product product = new Product();
		product.setProductId(1001);
		product.setProductName("hp Laptops");
		product.setProductDesc("Laptop with i7");
		product.setCatId(1001);
		product.setPrice(50000);
		product.setStock(04);
		product.setSupplierId(1001);
		
		assertTrue("Problem in Insertion" ,productDao.addProduct(product));
		
	}
	
	
	
}

