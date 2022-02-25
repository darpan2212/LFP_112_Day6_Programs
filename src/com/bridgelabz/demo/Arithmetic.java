package com.bridgelabz.demo;

public class Arithmetic {

	public int add(int a, int b) {
		return a + b;
	}

	public double division(double a, double b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}

	public static void main(String[] args) {
		Arithmetic addition = new Arithmetic();

		System.out.println(addition.add(5, 6));
	}

}