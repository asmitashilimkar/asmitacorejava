package com.sbp.methodoverloading;

public class Diagrams {
	
//	final float PI = 3.14f;
	private int radius;
	private int height;
	private int width;
	
	public Diagrams() {	
	}
	public Diagrams(int radius) {
		this.radius=radius;
	}
	
	public Diagrams(int height, int width) {
		this.height=height;
		this.width=width;
	}
	public void area(int radius) {
		System.out.println("Area of circle is " +(3.14*radius*radius));
	}
	public void area(int height, int width) {
		System.out.println("Area of ractangle "+(height*width));
	}
	
	public void area(int num1, float num2) {
		System.out.println("first int second float");
	}
	
	public void area(float num1, int num2) {
		System.out.println("first float second int");
	}
	
	public void printHeightWidth() {
		System.out.println("height: " + height);
		System.out.println("width: " + width);

	}

}
