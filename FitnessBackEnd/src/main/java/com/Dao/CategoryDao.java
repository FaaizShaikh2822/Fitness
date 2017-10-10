package com.Dao;

import java.util.List;
import java.util.Locale.Category;

public interface CategoryDao 
{
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);
	public List<Category> retreiveCategory();
	public Category  getCategory(int catId);
	boolean addCategory(org.junit.experimental.categories.Category category);
	boolean updateCategory(org.junit.experimental.categories.Category category);
	
}
