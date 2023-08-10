package com.big;

import com.Amazon;

public class AmazonRunner {

	public static void main(String[] args) {
		Amazon amazon = new Amazon();
		amazon.setIsshoppingplatform(true);
		System.out.println(amazon.isIsshoppingplatform());
		amazon.setCeo("andy jassy");
		System.out.println(amazon.getCeo());
		amazon.setColor("blewhit");
		System.out.println(amazon.getColor());
		amazon.setControls("autoplay");
		System.out.println(amazon.getControls());
		amazon.setDuration(60);
		System.out.println(amazon.getDuration());
		amazon.setLocation("us");
		System.out.println(amazon.getLocation());
		amazon.setPrimemembership(true);
		System.out.println(amazon.isPrimemembership());
		amazon.setUsers(89999765);
		System.out.println(amazon.getUsers());
		amazon.setQuality(720);
		System.out.println(amazon.getQuality());
		amazon.setSalry(290867);
		System.out.println(amazon.getSalry());
		amazon.SetStartyear(1994);
		System.out.println(amazon.getstartyear());
		amazon.setType(null);
		System.out.println(amazon.getType());

	}

}
