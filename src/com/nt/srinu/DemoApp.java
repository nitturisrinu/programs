package com.nt.srinu;

public class DemoApp {

	public int m1(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int m2(int a, int b) {
		int multi = a * b;
		return multi;
	}
	
	public static String m3(String str) {
		str="welcome to kadapa";
		return str;
	}
	
	

	public static void main(String[] args) {
		DemoApp d = new DemoApp();
		int add = d.m1(5, 5);
		int multi = DemoApp.m2(8, 6);
		String name=DemoApp.m3("L Srinu");
		System.out.println(name);
		System.out.println("multication of result:" + multi);
		System.out.println("addition of result:" + add);
	}

}
