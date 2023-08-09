package instancemethodoverloading;

public class Plier {
	

	    public String color;
	    public String brand;
	    public int cost;
	    
	    public void cut()
	    {
	    	System.out.println("invoking defalt cut method");
	    	cut("green","hp");
	    }
	    public void cut(String color)
	    {
	    	System.out.println("invoking string in cut");
	    	System.out.println("color:"+color);
	    	cut(color,brand,cost);
	    }
	    public void cut(String color,String brand)
	    {
	    	System.out.println("invoking string,float in cut");
	    	System.out.println("color:"+color);
	    	System.out.println("brand:"+brand);
	    	cut("red");
	    	
	    	
	    }
	    public void cut(String color,String brand,int cost)
	    {
	    	
	    	
	    	
	    	System.out.println("invoking int,float,int  cut ");
	    	System.out.println("color:"+color);
	    	System.out.println("brand:"+brand);
	    	System.out.println("cost:"+cost);
	    	
	    }



	}

