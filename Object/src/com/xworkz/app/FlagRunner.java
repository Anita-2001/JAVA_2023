package com.xworkz.app;

public class FlagRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flag flag=new Flag();
		System.out.println(flag);
		
		Flag flag1=new Flag("india","blue",1947);
		System.out.println(flag1);
        Flag flag3=new Flag("china","yellow",1948);
        System.out.println(flag3);
        
        Logo logo=new Logo();
        logo.toString();
        Logo logo1=new Logo("india",2,400,"rred",56);
        System.out.println(logo1);
        Logo logo3=new Logo("brasil",3,300,"pink",45);
        System.out.println(logo3);
        
        Kerchief ref=new Kerchief();
        System.out.println(ref);
        Kerchief ref1=new Kerchief("yellow",4,70,false,"polister",12,"england");
        System.out.println(ref1);
        Kerchief ref2=new Kerchief("yellow",4,70,false,"polister",12,"england");
        System.out.println(ref2);
        
        Biscuit cut=new Biscuit();
        System.out.println(cut);
        Biscuit ct=new Biscuit("parleg", 5, false);
        System.out.println(ct);
        Biscuit cuit=new Biscuit(null,4,false);
        System.out.println(cuit);
        
        Cave cave=new Cave();
        System.out.println(cave);
        Cave cave1=new Cave(0, null, 0, null, null, 0, null, null, null, false);
        System.out.println(cave1);
        Cave cave2=new Cave(2,"chirf",4,"stone","black",5,null,null,null, false);
        System.out.println(cave2);
        
        Pendant pen=new Pendant();
        System.out.println(pen);
        Pendant pen1=new Pendant(0, null, null, 0, 0, null, 0, 0, 0, null, 0);
        System.out.println(pen1);
        Pendant pen2=new Pendant(2,"pearl","pearl",7,22220,"white",4,4,1,"halmark",7);
        System.out.println(pen2);
	}

}