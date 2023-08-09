package Overriding;

public class GoldBangle extends Bangle
{
	 @Override
	 public void decorate() {
	 	 System.out.println("invoking decorate in goldbangle...");
	 	super.decorate();
	 }

}
