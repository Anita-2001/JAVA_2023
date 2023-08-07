package instancemethodoverloading;

public class Gadget {
	
		public String color;
		public float cost;
		public int size;
		public String shape;
		
		public void work()
		{
			System.out.println("invoking vision in work");
			 work(cost,color);
		}
		public void work(String color)
		{
			System.out.println("invoking string in work");
		}
		public void work(String shape,float cost)
		{
		System.out.println("invoking string ,float in vision");	
		System.out.println("shape" +shape);
		System.out.println("cost:" +cost);
		}
		public void work(float cost,String color)
		{
			System.out.println("invoking float,string in work");
			System.out.println("cost" +cost);
			System.out.println("color" +color);
		}
		

	}

