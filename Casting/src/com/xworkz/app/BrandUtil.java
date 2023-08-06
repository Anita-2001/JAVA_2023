package com.xworkz.app;

import com.xworkz.app.Duplicatebrand.DuplicateBrand;

public class BrandUtil extends Brand {

		public static void run(Brand brand) {
			String s=brand.name;
			System.out.println(s);
			brand.shop();

			if (brand instanceof LocalBrand) 
			{
				System.out.println("brand is LocalBrand");

				LocalBrand localBrand = (LocalBrand) brand;
				System.out.println(localBrand.location);
				localBrand.collection();
			}
			
			if (brand instanceof NationalBrand) {
				System.out.println("brand is nationalBrand");

				NationalBrand nationalBrand = (NationalBrand) brand;
				System.out.println(nationalBrand.noOfBrand);
				nationalBrand.coustomer();
			
			}
			if (brand instanceof InternationalBrand) {
				System.out.println("brand is internationalBrand");

				InternationalBrand internationalBrand = (InternationalBrand) brand;
				System.out.println(internationalBrand.price);
				internationalBrand.coustomer();
			
			}
			if (brand instanceof DuplicateBrand) {
				System.out.println("brand is DuplicateBrand");

				DuplicateBrand duplicateBrand = (DuplicateBrand) brand;
				System.out.println(duplicateBrand.newBrand);
				duplicateBrand.showing();
			
			}
		}

}
