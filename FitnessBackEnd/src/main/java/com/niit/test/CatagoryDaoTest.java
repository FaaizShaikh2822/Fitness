package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.CategoryDao;
import com.model.Category;

public class CatagoryDaoTest
{
	public static void initialize()
	{
		AnnotationConfigApplicationContext configApplnContext = new AnnotationConfigApplicationContext();
		configApplnContext.scan("com");
		configApplnContext.refresh();
		
		SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("hiberConfig.class");
		
		CategoryDao categoryDao=(CategoryDao)configApplnContext.getBean("hiberconfig.class");
		
	}
	

	@Test
	public void addCategoryTest()
	{
		Category category = new Category();
		category.setCatId(1001);
		category.setName("Shirt");
		category.setDesc("Wrangler Shirtings");
		
		assertTrue(CategoryDao.addCategory(category));
	}
	
	@Test
	public void updateCategoryTest()
	{
		Category category = new Category();
		category.setCatId(1001);
		category.setName("JMShirt");
		category.setDesc("John Miller Shirtings");
		
		assertTrue(categoryDao.updateCategory(category));
	}
	
	public void show(List<Category> listCategory)
	{
		for(Category category : listCategory)
		{
			System.out.println("Category Id "+category.getCatID());
			System.out.println("Category Name "+category.getCatName());
		}
	}
	
	@Test
	public void getCategoryTest()
	{
		Category category = CategoryDao.getCategory(1002);
		assertNotNull();
	}
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}

}
