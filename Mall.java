class Mall{
   String name;
   int cost;
   int rooms;
   short floors;
   double height;
   int workers;
   String material;
  
   Mall(String name)
   {
	   System.out.println("invoking name in mall constructor");
	   this.name=name;
   }
   Mall(String name,int cost)
   {
	   this(name);
	   System.out.println("invoking name,int  in mall constructor");
       this.cost=cost;
	   
   }
   Mall(String name,int cost,int rooms)
   {
	   this(name,cost);
	   System.out.println("invoking name ,cost,rooms in mall constructor");
       this.rooms=rooms;
   }
   Mall(String name,int cost,int rooms,short floors)
   {
	   this(name,cost,rooms);
	   System.out.println("invoking name,cost,rooms,floors in mall constructor");
       this.floors=floors;
   }
   Mall(String name,int cost,int rooms,short floors,double height)
   {
	   this(name,cost,rooms,floors);
	   System.out.println("invoking name,cost,rooms,floors,height in mall constructor");
       this.height=height;
   }
   Mall(String name,int cost,int rooms,short floors,double height,int workers)
   {
	   this(name,cost,rooms,floors,height);
	   System.out.println("invoking name,cost,rooms,floors,height,workers in mall constructor");
       this.workers=workers;
   }
   Mall(String name,int cost,int rooms,short floors,double height,int workers,String material)
   {
	   this(name,cost,rooms,floors,height,workers);
	   System.out.println("invoking name,cost,rooms,floors,height,workers,material in mall constructor");
       this.material=material;
   }



}