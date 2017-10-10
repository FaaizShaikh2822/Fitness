package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Category
{
	@Id
	int catId;
	String name,desc;
	public int getCatId() 
	{
		return catId;
	}
	public void setCatId(int catId) 
	{
		this.catId = catId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDesc() 
	{
		return desc;
	}
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}
}
