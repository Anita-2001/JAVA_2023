package instancemethodoverloading;

public class IronBox {
	
	public String brand;
	public void Heat()
	{
		System.out.println("invoking no argument heat in ironbox");
		
	}
	public void Heat(String brand)
	{
		System.out.println("invoking string in heat method");
		this.brand=brand;
		this.Heat(null, 0);
	}
	public void Heat(String brand,float price)
	{
		System.out.println("invoking string,float in heat");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
	public void Heat(String brand,int watts)
	{
		System.out.println("invoking string,int in heat");
		System.out.println("brand:"+brand);
		System.out.println("watts:"+watts);
	
	}

}
