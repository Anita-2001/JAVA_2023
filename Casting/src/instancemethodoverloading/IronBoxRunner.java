package instancemethodoverloading;

public class IronBoxRunner {

	public static void main(String[] args) 
	{
		IronBox box=new IronBox();
		box.Heat("havells");
		box.Heat("phillips", 500);
		

	}

}
