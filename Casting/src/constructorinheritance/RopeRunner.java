package constructorinheritance;

public class RopeRunner {

	public static void main(String[] args) 
	{
		Thread thread=new Thread("nylon",700,false,45);
		System.out.println(thread.material);
		System.out.println(thread.cost);
		System.out.println(thread.bending);
		System.out.println(thread.size);
		
		Thread ref=new Thread();
		System.out.println(ref.bending);
		System.out.println(ref.cost);
		System.out.println(ref.size);
		
		

	}

}
