package com.model;

import javax.persistence.Id;

public class Supplier 
{
	@Id
	String supplierName,supplierDesc;
	int supplierId;
	
	public String getSupplierName()
	{
		return supplierName;
	}
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}
	public String getSupplierDesc()
	{
		return supplierDesc;
	}
	public void setSupplierDesc(String supplierDesc)
	{
		this.supplierDesc = supplierDesc;
	}
	public int getSupplierId()
	{
		return supplierId;
	}
	public void setSupplierId(int supplierId)
	{
		this.supplierId = supplierId;
	}
}
