package constructorinheritance;

public class Mushroom {
	public String color;
	public int calories;
	public boolean edible;
	public float price;
	
	public Mushroom(String color,int calories,boolean edible,float price)
	{
		System.out.println("invokink constructor with string,int,boolean,float ");
		this.color=color;
		this.calories=calories;
		this.edible=edible;
		this.price=price;
		
	}

	
	

}
