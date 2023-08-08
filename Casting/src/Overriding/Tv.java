package Overriding;

public class Tv extends Theatre
{
	@Override
	public void show() {
		System.out.println("invoking show in tv...");
		super.show();
	}

}
