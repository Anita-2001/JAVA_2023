package constructorinheritance;

public class Gold
{
	public float price;
    public double gst;
    public String type;
    public boolean quality;
    
    public Gold(double gst, float price, boolean quality, String type)
    {
    	System.out.println("invoking doble,float,boolean,string in gold");
    	this.gst=gst;
    	this.price=price;
    	this.quality=quality;
    	this.type=type;
    }
    public Gold()
    {
    	System.out.println("invoking no argument constructor in gold");
    }

}
