package constructorinheritance;

public class Thread extends Rope 
{
	public Thread()
	{
		super("hemp",200,false,69);
		
	}
	
	public Thread(String material,int cost,boolean bending,int size)
	{
		super(material,cost,bending,size);
	}
	

}	