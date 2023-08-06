package constructorinheritance;

public class Site extends Ground
{

	public Site(int length, String name, String type, int width) {
		super(length, name, type, width);
	
	}
	public Site()
	{
		super(800,"ksr","cricket",700);
	}
	

}
