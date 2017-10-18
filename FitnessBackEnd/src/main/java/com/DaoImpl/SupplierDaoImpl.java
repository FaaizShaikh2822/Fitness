package com.DaoImpl;

import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;

import com.Dao.SupplierDao;
import com.model.Supplier;

public class SupplierDaoImpl implements SupplierDao
{
	SessionFactory sessionFactory;

	public boolean addSupplier(Supplier supplier)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean updateSupplier(Supplier supplier)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean deleteSupplier(Supplier supplier)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public List<Supplier> retrieveSupplier() 
	{
		Session session = (Session) sessionFactory.openSession();
		return null;
	}

	public Supplier getSupplier(int supplierId)
	{
		Session session = (Session) sessionFactory.openSession();
		return null;
	}

	
	
}
