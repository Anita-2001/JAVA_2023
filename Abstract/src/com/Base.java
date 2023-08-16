package com;

/*abstact classes  using final methods*/

public class Base {
  final void fun()          /*final methods cannot be overriden*/
  {
	  System.out.println("invoking final in base");
  }
}
  
  class Derived extends Base{
	  
  }

  class Cfg{
	  public static void main(String[] args)                  /*static only be declared in mainmethod*/
	  {
		  Base ref=new Derived();
		  ref.fun();
		  
	  }
  }

