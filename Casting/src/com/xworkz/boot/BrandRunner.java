package com.xworkz.boot;

import com.xworkz.app.Brand;
import com.xworkz.app.BrandUtil;

import com.xworkz.app.InternationalBrand;
import com.xworkz.app.LocalBrand;
import com.xworkz.app.NationalBrand;

public class BrandRunner {

	public static void main(String[] args) {

		System.out.println("invocking main in BrandRunner");

		Brand brand = new Brand();

		LocalBrand localBrand = new LocalBrand();
		NationalBrand nationalBrand = new NationalBrand();
		
		InternationalBrand internationalBrand=new InternationalBrand();
		

		BrandUtil.run(brand);
		BrandUtil.run(localBrand);
		BrandUtil.run(nationalBrand);
		
		BrandUtil.run(internationalBrand);
		
	}
}

	
