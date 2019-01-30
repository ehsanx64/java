package javatest;

import java.util.*;

public class ArrayList {
	private String[] defaultNames = { "Eve", "Adam" };
	private List<String> names;

	public ArrayList() {
		names = new java.util.ArrayList<String>();
	}

	private void testNames() {
		for (String n : names) {
			switch (n) {
			case "Eve":
				System.out.println(n + " is Adam's wife");
				break;
			case "Adam":
				System.out.println(n + "??! He's Eve's husband");
				break;
			default:
				System.out.println("I don't know " + n + "!");
				break;
			}
		}
	}

	private void addMoreNames() {
		names.add("Seth");
		names.add("Abel");
		names.add("Cain");
		names.add("Sam");
	}

	private void getAllNamesSize() {
		System.out.println("Default names size: " + defaultNames.length);
		System.out.println("Names size: " + names.size());
	}

	private void copyDefaultNamesToNames() {
		for (int i = 0; i < defaultNames.length; i++) {
			names.add(defaultNames[i]);
		}
	}

	private void showNames() {
		for (int i = 0; i < names.size(); i++) {
			System.out.println("names[" + i + "] == \"" + names.get(i) + "\";");
		}
	}

	private void printHeader(String title) {
		System.out.println("*** " + title);
	}

	private void cr() {
		System.out.println();
	}

	public void test1() {
		printHeader("Get name size add the beginning");
		getAllNamesSize();
		cr();

		printHeader("Copy default names to `names' and get new size");
		copyDefaultNamesToNames();
		getAllNamesSize();
		cr();

		printHeader("Add more names");
		addMoreNames();
		getAllNamesSize();
		cr();

		printHeader("Show all names");
		showNames();
		cr();

		printHeader("Check all names");
		testNames();
		cr();
	}
}

