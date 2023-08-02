package com.ubdt;

public class ToothPaste 
{
	public String name;
	public String brand;
	public Company company;
	public Ingredient[] ingredients;
	
	
	public ToothPaste(String name, String brand, Company company, Ingredient[] ingredients)
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredients=ingredients;
	
	}
	
	public void printInfo()
	{
		System.out.println(name);
		System.out.println(brand);
		System.out.println(company);
		
		for(int index=0;index<ingredients.length;index++)
		{
	      System.out.println(ingredients[index]);	
			
		}
		
	}
	
}
