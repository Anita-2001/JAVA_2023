package Overriding;

public class BigGate extends Gate
{
	public void close()
	{
		System.out.println("invoking close in biggate...");
	}

}
