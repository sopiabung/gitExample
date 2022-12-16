package _homework;

import _11.Vehicle;

public class Plane implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Plane speedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Plane speedDown");
	}

	@Override
	public void handle() {
		System.out.println("Plane handling");
	}

}
