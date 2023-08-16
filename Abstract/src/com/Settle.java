package com;

public class Settle extends Futureplans
{
 
@Override
int age() {
	// TODO Auto-generated method stub
	return 0;
}
 @Override
	void building() {
		// TODO Auto-generated method stub
		
	}
 
@Override
boolean marriage() {
	// TODO Auto-generated method stub
	return false;
}
@Override
int children() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
void job() {
	// TODO Auto-generated method stub
	
}
 
public static void main(String[] args) {
	Futureplans plans=new Settle();
	plans.name();
	plans.age();
	plans.building();
}
}