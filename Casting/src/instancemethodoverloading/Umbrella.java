package instancemethodoverloading;

public class Umbrella {

    public String color;
    public String brand;
    public int cost;
    
    public void protect()
    {
    	System.out.println("invoking defalt serve method");
    	protect(color,brand);
    }
    public void protect(String color)
    {
    	System.out.println("invoking string in protct");
    	System.out.println("color:"+color);
    	protect(color,brand,cost);
    }
    public void protect(String color,String brand)
    {
    	System.out.println("invoking string,float in sreve");
    	System.out.println("color:"+color);
    	System.out.println("brand:"+brand);
    	protect("red");
    	
    	
    }
    public void protect(String color,String brand,int cost)
    {
    	
    	
    	
    	System.out.println("invoking int,float,int  in serve");
    	System.out.println("color:"+color);
    	System.out.println("brand:"+brand);
    	System.out.println("cost:"+cost);
    	
    }



}
