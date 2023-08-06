package constructorinheritance;

public class GoldRunner {

	public static void main(String[] args) 
	{
		Gold gold=new Gold();
		System.out.println(gold.gst);
		System.out.println(gold.price);
		System.out.println(gold.quality);
		
		
		RoseGold gold1=new RoseGold(3.2,8000,false,"high");
		System.out.println(gold1.gst);
		System.out.println(gold1.price);
		System.out.println(gold1.quality);
		System.out.println(gold1.type);
		
		

	}

}
