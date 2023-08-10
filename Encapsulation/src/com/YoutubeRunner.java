package com;

public class YoutubeRunner {
	public static void main(String[] args) {
		Youtube tube = new Youtube();
		tube.setChannelName("neso");
		System.out.println(tube.getChannelName());
		tube.setName("neilmohan");
		System.out.println(tube.getCeo());
		tube.setColor("red");
		System.out.println(tube.getColor());
		tube.setControls("autoplay");
		System.out.println(tube.getControls());
		tube.setDuration(30);
		System.out.println(tube.getDuration());
		tube.setGoldenButton(true);
        System.out.println(tube.isGoldenButton());
        tube.setQuality(420);
        System.out.println(tube.getQuality());
        tube.setSilverButton(false);
        System.out.println(tube.isSilverButton());
        tube.setSalry(90000);
        System.out.println(tube.getSalry());
        tube.setStartyear(2005);
        System.out.println(tube.getstartyear());
        tube.setSubscribe(true);
        System.out.println(tube.isSubscribe());
        tube.setType("video");
        System.out.println(tube.getType());
        tube.setUsers(699999763);
        System.out.println(tube.getUsers());
       
		
		
		
	}

}
