package javatest;

import java.util.regex.*;

public class RegExp {
	public static void main (String[] args) {
		RegExp regexp = new RegExp();
		regexp.demo();
	}

	public void demo() {
		findPattern();
	}

	public void findPattern() {
		String str = "Some stuff <span>25</span> here and <span>Hello</span> some here";
		System.out.println("String: " + str);

		Pattern p = Pattern.compile("((<span>)+[0-9]*(</span>)+)");
		Matcher m = p.matcher(str);

		if (m.find()) {
			System.out.println("Found something");
			System.out.println(m);
		} else {
			System.out.println("Nothing found...");
		}
	}
}
