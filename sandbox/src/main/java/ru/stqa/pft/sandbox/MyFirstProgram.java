package ru.stqa.pft.sandbox;

import jdk.swing.interop.SwingInterOpUtils;

public class MyFirstProgram {

	public static void main(String[] args) {
		String somebody = "world";
		System.out.println("Hello, " +somebody+"!");

		double l = 8.0;
		double s = l * l;
		System.out.println("Площаь квадрата со стороной "+ l + " = " + s);
	}
}