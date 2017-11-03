package com.DaoImpl;

import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;

import com.Dao.ProductDao;
import com.model.Product;

public class ProductDaoImpl implements ProductDao
{
	SessionFactory sessionFactory;


	public boolean addProduct(Product product) 
	{
		try
		{
			sessionFactory.getCurrentSession();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean deleteProduct(Product product) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public List<Product> retrieveProducts() 
	{
		Session session = (Session) sessionFactory.openSession();
		return null;
	}

	public Product getProduct(int ProductId) 
	{
		Session session = (Session) sessionFactory.openSession();
		return null;
	}
}
