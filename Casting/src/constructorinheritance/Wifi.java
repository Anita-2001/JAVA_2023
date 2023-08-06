package constructorinheritance;

public class Wifi extends Router
{

	public Wifi(int noofswitches, String type, int ports, boolean secure)
	{
		super(noofswitches, type,ports , secure);
		
	}
	
	public Wifi()
	{
		super(4,"wireless",8,false);
	}
	

}
