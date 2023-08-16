package com.xworkz.app;

public class Logo {
 private String name;
 private int size;
 private float cost;
 private String color;
 private int width;
 
 public Logo()
 {
	 System.out.println("invoking no-argument constructor ");
 }
public Logo(String name, int size, float cost, String color, int width) {
	super();
	this.name = name;
	this.size = size;
	this.cost = cost;
	this.color = color;
	this.width = width;
}
 
 
   public String toString()
 {
	 return "name:"+this.name+"size:"+this.size+"cost:"+this.cost+"color:"+this.color+"width:"+this.width;
 }
}