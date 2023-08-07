package instancemethodoverloading;

public class GadgetRunner {
	public static void main(String[] args)
	{
		Gadget gadget=new Gadget();
	
		gadget.work();

		System.out.println("=======================");
		
		Mouse mic=new Mouse();
		mic.comand();
		mic.comand(78);
		
		
		
		
		System.out.println("=============");
		
		
		Staple ref=new Staple();
		ref.join();
		ref.join("canva", 89);
	}
	

}
