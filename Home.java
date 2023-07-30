class Home
{
  String fatherName;
  int noOfpeoples;
  int noOfRooms;
  float size;
 
 static void main()
{
System.out.println("invkoing Home with no arguments");
}
 static void main(String fatherName)
{
 System.out.println("invkoing Home string arguenmet");
 this.fatherName=fatherName;
}
 static void main(String fatherName,int noOfpeoples)
 {
 this(fatherName);
 System.out.println("invkoing Home string,int arguenment");
 this.noOfpeoples=noOfpeoples;
}
 static void main(String fatherName,int noOfpeoples,float size)
{
 this(String fatherName,int noOfpeoples);
 System.out.println("invkoing Home string,int ,float arguenment");
  this.size=size;
}

public static void main(String[] args)
{
 Home home=new Home();
}
}
