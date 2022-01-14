package com.nt.srinu;

public class Demo6 {

	String str = "nagendra";

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public String Hii() {

		return str;

	}

	public String H1() {

		return "welcome to world";

	}

	public static void main(String[] args) {
		Demo6 g = new Demo6();
		int display = g.sum(5, 6);
		System.out.println(display);
		String gg = g.Hii();
		System.out.println(gg);
		//String strr = g.H1("LSRINU");
		//System.out.println(strr);
		String h2=g.H1();
		System.out.println(h2);

	}

}
