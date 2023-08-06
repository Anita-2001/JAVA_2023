package constructorinheritance;

public class RouterRunner {

	public static void main(String[] args)
	{
		Wifi router=new Wifi();
		System.out.println(router.noofswitches);
		System.out.println(router.ports);
		
		Wifi ref1=new Wifi();
		System.out.println(ref1.noofswitches);
		System.out.println(ref1.ports);
		System.out.println(ref1.secure);
		System.out.println(ref1.type);
				

	

}
}