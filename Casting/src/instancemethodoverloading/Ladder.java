package instancemethodoverloading;

public class Ladder {
	
	public double height;
	public double weight;
	public int width;
	
	public void toClimb()
	{
		System.out.println("Invokig no arg ");
		toclimb(height,weight);
	}
	public void toclimb(double height)
	{
		System.out.println("invoking doule in toclimb");
		System.out.println("heiht:"+height);
	}
	public void toclimb(double height,double weight)
	{
		System.out.println("invoking double,double toclimb");
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
		toclimb(weight);
	}
	public void toclimb(double height,double weight,int width)
	{
		System.out.println("invoking double,double,int in toclimb");
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
		System.out.println("width:"+width);
		toClimb();
		
	}
	

}
