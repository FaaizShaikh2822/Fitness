package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity
public class Product
{
	@Id
	String ProductName,ProductDesc;
	int ProductId,Stock,Price,CatId,SupplierId;
	
	public String getProductName()
	{
		return ProductName;
	}
	public void setProductName(String productName) 
	{
		ProductName = productName;
	}
	public String getProductDesc()
	{
		return ProductDesc;
	}
	public void setProductDesc(String productDesc) 
	{
		ProductDesc = productDesc;
	}
	public int getProductId()
	{
		return ProductId;
	}
	public void setProductId(int productId)
	{
		this.ProductId = productId;
	}
	public int getStock()
	{
		return Stock;
	}
	public void setStock(int stock)
	{
		Stock = stock;
	}
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		Price = price;
	}
	public int getCatId() 
	{
		return CatId;
	}
	public void setCatId(int catId) 
	{
		CatId = catId;
	}
	public int getSupplierId() 
	{
		return SupplierId;
	}
	public void setSupplierId(int supplierId)
	{
		SupplierId = supplierId;
	}

	
}
