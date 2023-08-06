package constructorinheritance;

public class Router 
{
	public int noofswitches;
	public String type;
	public int ports;
	public boolean secure;
	
	public Router(int noofswitches,String type,int ports,boolean secure)
	{
		System.out.println("invoking router int,string,int,boolean");
		this.noofswitches=noofswitches;
		this.type=type;
		this.ports=ports;
		this.secure=secure;
	}

}
