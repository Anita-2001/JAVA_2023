package com.ubdt.app;

import com.ubdt.Company;
import com.ubdt.Ingredient;
import com.ubdt.ToothPaste;

public class ToothPasteRunner 
{
	public static void main(String[] args)
	{
	     String name="ramdev";
		 String brand="dantkanti";
		
		   Company company=new Company("closup","dev","india"); 
		   company.printInfo();
		
		Ingredient ingredients1=new Ingredient("salt",6,80f);
		Ingredient ingredients2=new Ingredient("mint",4,90);
		Ingredient ingredients3=new Ingredient("chlorine",7,45);
		Ingredient ingredients4=new Ingredient("taste",7,50);
		Ingredient ingredients5=new Ingredient("tulsi",3,89);
		
		Ingredient[] ingredientsref= {ingredients1,ingredients2,ingredients3,ingredients4,ingredients5};
		  
		ToothPaste paste=new ToothPaste(name, brand, company, ingredientsref);
         paste.printInfo();
         
      
         
        				
	}

}
