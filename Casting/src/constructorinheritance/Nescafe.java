package constructorinheritance;

public class Nescafe extends Coffe
{

	public Nescafe(int caffenine, float cost, String name, String type) 
	{

		super(caffenine, cost, name, type);
		System.out.println("invoking int,float,string,string in nescafe");
		System.out.println("caffenine:"+caffenine);
		System.out.println("cost:"+cost);

		
	}
	public Nescafe()
	{
		super(50,250,"capucchino","arabica");
	}
	

}
