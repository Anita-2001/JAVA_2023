package com;

public class Synopsis extends Project
{
	public boolean report()
	{
		System.out.println("report in synopsis");
		return true;
	}
	@Override
	public int pages() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	public Synopsis()
	{
		System.out.println("time in synopsis");
	}
	public void time()
	{
		System.out.println("time in synopsis");
	}
	 public void objective()
	{
		System.out.println("objctive in synopsis");
	}
	 public void uniqueness()
	 {
		 System.out.println("uniqueness in synopsis");
	 }
	public void collaboratin()
	{
		System.out.println("invoking collaboration in synopsis");
		
	}
	public void flexibility()
	{
		System.out.println("flexibilty in synopsis");
	}
	public void planning()
	{
		System.out.println("planning in synopsis");
	}
	@Override
	public void collaboration() {
		// TODO Auto-generated method stub
		super.collaboration();
	}
	@Override
	public boolean conclusion() {
		// TODO Auto-generated method stub
		return super.conclusion();
	}
}
