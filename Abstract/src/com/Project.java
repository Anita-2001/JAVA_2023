package com;

public abstract class Project {
 public Project() 
 {
	
	System.out.println("invoking default in project");
 }
 public Project(String name)
 {
	 System.out.println("invoking string in project");
 }
 public abstract boolean report();
 public abstract int pages();
 abstract void time();
 public abstract void objective();
 public abstract void uniqueness();
  
 public void collaboration()
 {
	 System.out.println("invoking colllaboration in project");
 }
 public void flexibility()
 {
	 System.out.println("invoking flexibility in poject");
 }
 public void plannning()
 {
	 System.out.println("invoking planning in project");
 }
 public boolean conclusion()
 {
	 System.out.println("invoking conclusion in project");
	 return false;
 }
 public void abstraction()
 {
	 System.out.println("invoking abstraction in project");
 }
 
 }
