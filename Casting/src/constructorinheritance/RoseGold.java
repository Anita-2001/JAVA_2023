package constructorinheritance;

public class RoseGold extends Gold {
	

	 public RoseGold(double gst, float price, boolean quality, String type) {
		super(gst, price, quality, type);

	}
   public RoseGold()
	{
	  super(7.5,9000,false,"solid");

	}

}
