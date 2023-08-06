package constructorinheritance;

public class Kohinoor extends Diamond
{

	public Kohinoor(String material, float price, int size, String type) 
	{
		super(material, price, size, type);
	
	}
	
	public Kohinoor()
	{
		super("carbon",900000,7,"hard");
	}
	

}
