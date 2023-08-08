package Overriding;


public class OverridingRunner {
	public static void main(String[] args)
	{
		
	
	
	Smallamoeba amoeba=new Smallamoeba();
	amoeba.catchesfood();
	Amoeba ref1=new Amoeba();
	ref1.catchesfood();
    Amoeba ref=new Smallamoeba();
	ref.catchesfood();
	Robert robert=new Robert();
	robert.hunt();
	Dinosaur ref3=new Dinosaur();
	ref3.hunt();
	Bangle bangle=new Bangle();
	bangle.decorate();
	Bangle bangle1=new GoldBangle();
	bangle1.decorate();
	GoldBangle ref4=new GoldBangle();
	ref4.decorate();
	Pamphlet ref5=new Pamphlet();
	ref5.design();
	Flex ref6=new Pamphlet();
	ref6.design();
	Flex flex=new Flex();
	flex.design();
	Drum mug=new Mug();
	mug.store();
	Tv tv=new Tv();
	tv.show();
	Mic mic=new Mic();
	mic.mute();
	Coal coal=new Charcoal();
	coal.energy();
	
}

}
