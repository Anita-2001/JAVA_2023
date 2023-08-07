package instancemethodoverloading;

public class Mouse {
	
		
		public double height;
		public double weight;
		public int width;
		
		public void comand()
		{
			System.out.println("Invokig no arg ");
			comand(height,weight);
		}
		public void comand(double height)
		{
			System.out.println("invoking doule in toclimb");
			System.out.println("heiht:"+height);
		}
		public void comand(double height,double weight)
		{
			System.out.println("invoking double,double toclimb");
			System.out.println("height:"+height);
			System.out.println("weight:"+weight);
			comand(weight);
		}
		public void comand(double height,double weight,int width)
		{
			System.out.println("invoking double,double,int in toclimb");
			System.out.println("height:"+height);
			System.out.println("weight:"+weight);
			System.out.println("width:"+width);
			comand();
			
		}
		

	}



