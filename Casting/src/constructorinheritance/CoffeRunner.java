
package constructorinheritance;

public class CoffeRunner {

	public static void main(String[] args) 
	{
		Nescafe cafe=new Nescafe(56,200,"malgudi","filter");
		System.out.println(cafe.caffenine);
		System.out.println(cafe.cost);
		System.out.println(cafe.name);
		System.out.println(cafe.type);
		
		Nescafe ref=new Nescafe();
		System.out.println(ref.caffenine);
		System.out.println(ref.cost);


	}

}
