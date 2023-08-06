package constructorinheritance;

public class Nescafe extends Coffe
{

	public Nescafe(int caffenine, float cost, String name, String type) {
		super(caffenine, cost, name, type);
		
	}
	public Nescafe()
	{
		super(50,250,"capucchino","arabica");
	}
	

}
