package constructorinheritance;

public class Coffe 
{
	public String name;
	public float cost;
	public int caffenine;
	public String type;

	public  Coffe(int caffenine, float cost, String name, String type)
	{
		System.out.println("invoking int flaot,string argument in coffe");
		this.caffenine=caffenine;
		this.cost=cost;
		this.name=name;
		this.type=type;
	}
}