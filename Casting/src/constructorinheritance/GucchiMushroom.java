package constructorinheritance;

public class GucchiMushroom extends Mushroom
{
	

	public GucchiMushroom(String color,int calories, boolean edible, float price)
	{
		super(color,calories, edible, price);
		
	}

	public GucchiMushroom()
	{
		super("black",22,false,100);
	}
}
