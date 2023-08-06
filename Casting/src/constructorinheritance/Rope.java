package constructorinheritance;

public class Rope 
{
	public String material;
	public int cost;
	public boolean bending;
	public int size;
	
	public Rope(String material,int cost,boolean bending,int size )
	{
		System.out.println("invoking rope in rope");
		this.material=material;
		this.cost=cost;
		this.bending=bending;
		this.size=size;
	}

}
