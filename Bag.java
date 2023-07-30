class Bag
{
  int cost;
  String color;

 public void instanceVarMethod(int cost,String color);
{
 System.out.println("cost is"+cost);
 System.out.println("color is"+color);
 
}
 
 public static void main(String[] args)
{
 Bag.instanceVarMethod(699,"kk");
 
}
}