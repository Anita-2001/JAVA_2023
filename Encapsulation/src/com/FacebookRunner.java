package com;

public class FacebookRunner {

	public static void main(String[] args) {
		Facebook book = new Facebook();
		book.setName("facebook");
		System.out.println(book.getName());
		book.setCeo("markzugenberg");
		System.out.println(book.getCeo());
		book.setColor("blue");
		System.out.println(book.getColor());
		book.setControls("muted");
		System.out.println(book.getControls());
		book.setDuration(45);
		System.out.println(book.getDuration());
		book.setFallowers(7899);
		System.out.println(book.getFallowers());
		book.setLocation("us");
		System.out.println(book.getLocation());
		book.setNoofworkers(7896);
		System.out.println(book.getNoofworkers());
		book.setPlatform("socialmedia");
		System.out.println(book.getPlatform());
		book.setQuality(120);
		System.out.println(book.getQuality());
		book.setSalry(67980);
		System.out.println(book.getSalry());
		book.setSize(60);
		System.out.println(book.getSize());
		book.setStartyear(1996);
		System.out.println(book.getStartyear());
		book.setType("meta");
		System.out.println(book.getType());

	}

}
