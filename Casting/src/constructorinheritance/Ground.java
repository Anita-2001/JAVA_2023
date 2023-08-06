package constructorinheritance;

public class Ground 
{
	public int width;
	public String name;
	public int length;
	public String type;
	
	public Ground(int length, String name, String type, int width)
	{
		System.out.println("invoking int,string,int,string in ground constructor");
		this.length=length;
		this.name=name;
		this.type=type;
		this.width=width;
	}

}
