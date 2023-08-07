package instancemethodoverloading;

public class Hotel 
{
    public String name;
    public float height;
    public int workers;
    public int chairs;
    
    public void serve()
    {
    	System.out.println("invoking defalt serve method");
    	serve(name,height);
    }
    public void serve(String name)
    {
    	System.out.println("invoking string in serve");
    	System.out.println("name:"+name);
    	serve(workers,height,chairs);
    }
    public void serve(String name,float height)
    {
    	System.out.println("invoking string,float in sreve");
    	System.out.println("name:"+name);
    	System.out.println("height:"+height);
    	serve("taj");
    	
    	
    }
    public void serve(int workers,float height,int chairs)
    {
    	
    	
    	
    	System.out.println("invoking int,float,int  in serve");
    	System.out.println("workers:"+workers);
    	System.out.println("height:"+height);
    	System.out.println("chairs:"+chairs);
    	
    }

}
