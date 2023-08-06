package constructorinheritance;

public class MushroomRunner {

	

	public static void main(String[] args) {

		
		GucchiMushroom mushroom = new GucchiMushroom("black",33,false,90);
		System.out.println(mushroom.calories);
		
		System.out.println(mushroom.color);
		System.out.println(mushroom.edible);
		System.out.println(mushroom.price);

		GucchiMushroom mushroom1 = new GucchiMushroom();
		System.out.println(mushroom1.calories);
		System.out.println(mushroom1.color);
	

	}

}
