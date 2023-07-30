class Mobile{
 String brand;
 int cost;
 String color;
 float capacity;
 
static void capture()
{
 System.out.println("method with no arguments");
}
static void capture(String brand)
{
System.out.println("method with String parameter");
System.out.println("brand"+brand);
}
static void capture(String brand,int cost)
{
System.out.println("method with String,int parameter");
System.out.println("brand"+brand);
System.out.println("cost"+cost);
}
static void capture(String color,float capacity,int cost)
{
System.out.println("method with String,int,float parameter");
System.out.println("color"+color);
System.out.println("capacity"+capacity);
System.out.println("cost"+cost);
}

public static void main(String[] args)
{
	
capture();
capture("xiomi");
capture("xiomi",10000);
capture("xiomi",32.0f,10000);
}
}
