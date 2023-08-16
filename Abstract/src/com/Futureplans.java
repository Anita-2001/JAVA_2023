package com;

public abstract class Futureplans {
	
	String name;
	abstract boolean marriage();

	abstract int children();

	abstract int age();

	abstract void building();

	abstract void job();

void buyingcar()
{
	System.out.println("invoking car in future");
}
void site()
{
	System.out.println("site in future plans");
}
public String name()
{
	System.out.println("invoking namae in futureplans");
	return name;
}
public int noofhouses()
{
	System.out.println();
	return 20;
}
public Futureplans()
{
System.out.println("invoking defalut constrotr futureplans");
}

}