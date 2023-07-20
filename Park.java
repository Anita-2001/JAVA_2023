class Park{
	int benches;
	String shop;
	String flower;
	int entryfee;
	int nooftrees;
	String bird;
	String things;
	double length;
	String typeoftree;
	
	Park(int benches)
	{
		System.out.println("invoking int in park constructor");
		this.benches=benches;
	}
	Park(int benches,String shop)
	{
		this(benches);
		System.out.println("invoking int,string in park constructor");
		this.shop=shop;
	}
	Park(int benches,String shop,String flower)
	{
		this(benches,shop);
		System.out.println("invoking int,string,string in park constructor");
		this.flower=flower;
	}
	Park(int benches,String shop,String flower,int entryfee)
	{
		this(benches,shop,flower);
		System.out.println("invoking int ,string,string,int in park constructor");
		this.entryfee=entryfee;
	}
	Park(int benches,String shop,String flower,int entryfee,int nooftrees)
	{
		this(benches,shop,flower,entryfee);
		System.out.println("int,string,string,int,int in constructor parkn");
		this.nooftrees=nooftrees;
	}
	Park(int benches,String shop,String flower,int entryfee,int  nooftrees,String bird)
	{
		this(benches,shop,flower,entryfee,nooftrees);
		System.out.println("int,string,string,int,int,string in park constructor");
		this.bird=bird;
	}
	Park(int benches,String shop,String flower,int entryfee,int nooftrees,String bird,String things)
	{
		this(benches,shop,flower,entryfee,nooftrees,bird);
	    System.out.println("int,string,string,int,int,string in park constructor");
		this.things=things;

	}
	 Park(int benches,String shop,String flower,int entryfee,int nooftrees,String bird,String things,double length)
	 {
	  	this(benches,shop,flower,entryfee,nooftrees,bird,things);
        System.out.println("int,string,string,int,int,string,int,int,string in park constructor");
        this.length=length;
	 }
	 Park(int benches,String shop,String flower,int entryfee,int nooftrees,String bird,String things,double length,String typeoftree)
	 {
		this(benches,shop,flower,entryfee,nooftrees,bird,things,length);
		System.out.println("int,string,string,int,int,string,int,int,string in park constructor");
        this.typeoftree=typeoftree;
	 }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	