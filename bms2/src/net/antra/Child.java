package net.antra;

public class Child extends Parent {

	int sec=123;
	
	Child(){
		super(10);
		super.m1();
		System.out.println("in child class constructor");
	}
	
	public void m2() {
		
		System.out.println("in m2 method in child");
	}
	public void m1() {
		System.out.println("in m1 method child class");
		
	}
}
