package constructorinheritance;

public class Diamond 
{
	public float price;
	public String type;
	public String material;
	public int size;
	
	public Diamond(String material, float price, int size, String type)
	{
		System.out.println("invoking string,float,int,string in diamond construcor");
		System.out.println();
		this.material=material;
		this.price=price;
		this.size=size;
		this.type=type;
	}

}
