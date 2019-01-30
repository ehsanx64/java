package javatest;

import java.io.*;

public class AskName {
	public static void main(String[] args) {
		AskName an = new AskName();
		an.demo();
	}

	public void demo() {
		Console cons = System.console();
		String name;

		System.out.print("Please enter your name: ");
		name = cons.readLine();
		System.out.println("Hello dear " + name + "! How are you?");
	}
}

