package com.nt.srinu;
public class demo1 {
static int a=10;
static int b=20;
int f=15; 
String str;
public static void m2()
{
	int c=25;
	int d=40;
	int e=c+d;
	System.out.println(e);
}
public static void s(String name)
{
 
  System.out.println("the name is:" +name);
}
public void m3() {
	int g=40;
	int h=25;
	int j=f*g;
	System.out.println(j);
}
public void m1()
{
	System.out.println("hello java");	
}
public static void main(String[] args) {
	demo1 rr=new demo1();
	rr.m2();
	rr.m1();
	System.out.println(a);
	System.out.println(rr.str);
	rr.m3();
	demo1.s("srinu");
}}