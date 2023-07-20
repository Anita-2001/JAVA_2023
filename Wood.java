class Wood{
	int cost;
	String material;
	float length;
	String color;
	double density;
	
	Wood()
	{
		
		System.out.println("invoking the no-argument wood constr");
	}
	Wood(int cost)
	{
		
		System.out.println("invoking int cost in wood constr");
		this.cost=cost;
	}
	Wood(int cost,String material)
	{
		this(cost);
    	System.out.println("invoking int,string in wood constr");
		this.material=material;

	}
	Wood(int cost,String material,float length)
	{
	    this(cost,material);
		System.out.println("invoking int,string,float in wood constr");
		this.length=length;

	}
	Wood(int cost,String material,float length,String color)
	{
		
	   	System.out.println("invoking int,string,float,string in wood constr");
		this.color=color;

	}
	Wood(int cost,String material,float length,String color,double density)
    {
		this(cost,material,length,color);
		System.out.println("invoking int ,string,float,string,double  in wood constr");
		this.density=density;

	}	
	
	
	
}