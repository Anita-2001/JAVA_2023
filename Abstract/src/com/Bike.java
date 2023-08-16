package com;

public abstract class Bike {

	abstract void run();

	abstract void travel();

	abstract void recreat();

	abstract void brake();

	abstract void frame();

	public void sport() {
		System.out.println("invoking sport in bike");
	}

	public void repair() {
		System.out.println("invoking repair in bike");
	}

	public void burns() {
		System.out.println("invoking burn in bike");
	}

	public void transport() {
		System.out.println("invoking transport in bike");
	}

	public void accelerate() {
		System.out.println("invoking accelre in bike");
	}

}
