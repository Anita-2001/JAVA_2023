package instancemethodoverloading;



public class UmrellaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umbrella umbrella=new Umbrella();
		umbrella.protect();
		umbrella.protect("blue");
		
		System.out.println("=============================");
		
		Plier ref=new Plier();
		ref.cut();
		ref.cut("black", "plilp");

	}

}
