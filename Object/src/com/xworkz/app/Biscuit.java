package com.xworkz.app;

public class Biscuit {

	
		private String Brand;
		private double price;
		private boolean qualityGood;
		

		public Biscuit() {
			System.out.println("invocking no arg in biscuit");
		}

		public Biscuit(String brand, double price, boolean qualityGood) {
			super();
			System.out.println("invocking biscuit");
			this.Brand = brand;
			this.price = price;
			this.qualityGood = qualityGood;
		}

		@Override
		public String toString() {

			return ("Brand:"+this.Brand  +"Price:"+this.price  +"qualityGood:"+this.qualityGood);
		}

}
