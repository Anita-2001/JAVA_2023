package instancemethodoverloading;

public class Staple {

		
		public String brand;
		public String color;
		public int width;
		public double weight;
		
		public void join()
		{
			System.out.println("Invokig no arg ");
			join(brand,weight);
		}
		public void join(String brand)
		{
			System.out.println("invoking doule in toclimb");
			System.out.println("brandt:"+brand);
		}
		public void join(String brand,double weight)
		{
			System.out.println("invoking double,double toclimb");
			System.out.println("height:"+brand);
			System.out.println("weight:"+weight);
			
		}
		public void join(String brand,double weight,int width)
		{
			System.out.println("invoking double,double,int in toclimb");
			System.out.println("brand:"+brand);
			System.out.println("weight:"+weight);
			System.out.println("width:"+width);
			join();
			
		}
		

	}



