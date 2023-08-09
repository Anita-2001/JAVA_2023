package instancemethodoverloading;

public class Specs
{
	public String color;
	public float cost;
	public int size;
	public String shape;
	
	public void vision()
	{
		System.out.println("invoking vision in specs");
		 vision(cost,color);
	}
	public void vision(String color)
	{
		System.out.println("invoking string in vision");
	}
	public void vision(String shape,float cost)
	{
	System.out.println("invoking string ,float in vision");	
	System.out.println("shape" +shape);
	System.out.println("cost:" +cost);
	}
	public void vision(float cost,String color)
	{
		System.out.println("invoking float,string in vision");
		System.out.println("cost" +67);
		System.out.println("color" +color);
	}
	

}
