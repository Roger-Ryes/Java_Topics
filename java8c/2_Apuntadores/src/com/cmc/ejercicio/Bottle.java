package com.cmc.ejercicio;

public class Bottle {
	public int liquid=20;
//	public Bottle() {}
	public Bottle(int liquid) {
		super();
		this.liquid = liquid;
	}
	public static void main(String[] args) {
		Bottle b1 = new Bottle(2);
		b1.liquid=10;
		System.out.println(b1.liquid);
		
	}
}
