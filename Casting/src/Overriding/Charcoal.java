package Overriding;

public class Charcoal extends Coal
{
	@Override
	public void energy() {
		System.out.println("invoking energy in charcoal...");
		
	}

}
