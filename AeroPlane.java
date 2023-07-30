class AeroPlane{
 double cost=767;
 String name="indian";
 String color="white";
 int noOfPeople=1000;
 float size=78f;
 
 AeroPlane()
{
  System.out.println("no argument constructor:");
  
}
 AeroPlane(String name)
{
  System.out.println(" String constructor:");
  this.name = name;
}
 AeroPlane(String name,double cost)
{
  System.out.println("String,double  constructor:");
  this.name = name;
  this.cost = cost;
}

public static void main(String[] args)
{
 AeroPlane plane=new AeroPlane();
 
 AeroPlane plane1=new AeroPlane("rrr");
 System.out.println(plane1.name);
 
 AeroPlane plane2=new AeroPlane("rty",5678);
 System.out.println(plane2.name);
 System.out.println(plane2.cost);
 
 


  
}
}
  