package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.SupplierDao;
import com.model.Supplier;

public class SupplierDaoTest 
{
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext configApplnContext = new AnnotationConfigApplicationContext();
		configApplnContext.scan("com");
		configApplnContext.refresh();
		
		SessionFactory sessionFactory = (SessionFactory) configApplnContext.getBean("hiberConfig.class");
		SupplierDao supplierDao = (SupplierDao) configApplnContext.getBean("supplierDao"); 
	}
	
	@Ignore
	@Test
	public void addSupplierTest()
	{
		Supplier supplier = new Supplier();
		supplier.setSupplierId(1001);
		supplier.setSupplierName("FA");
		supplier.setSupplierDesc("Indore region");
		
		
		assertTrue(supplierDao.addSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void updateSupplierTest()
	{
		Supplier supplier = new Supplier();
		supplier.setSupplierId(1001);
		supplier.setSupplierName("FA-S");
		supplier.setSupplierDesc("INDORE and BHOPAL region");
		
		
		assertTrue(supplierDao.updateSupplier(supplier));
		
	}
	
	public void retrieveSupplierTest()
	{
		List<Supplier> listSupplier = supplierDao.retrieveSupplier();
	}

	public void show(List<Supplier> listSupplier)
    {
        for(Supplier category:listSupplier)
        {
            System.out.println("Supplier ID:"+category.getSupplierId());
            System.out.println("Supplier Name:"+category.getSupplierName());
        }
    }
     
     
    @Test
    public void getSupplierTest()
    {
    	Supplier category=supplierDao.getCategory(101);
        assertNotNull("Problem in Getting:",category);
        System.out.println("Category ID:"+category.getSupplierId());
        System.out.println("Category Name:"+category.getSupplierName());
        System.out.println("Category Description  = "+category.getSupplierDesc());
    }

}
