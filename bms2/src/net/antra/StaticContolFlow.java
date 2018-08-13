package net.antra;

public class StaticContolFlow {

	static int x=10;
	
	static {
		System.out.println(x);
		m1();
		System.out.println("in static block 1");
	}
	
	public static void main(String[] args) {
	
		m1();
		System.out.println("in main method");
		
	}

	static {
		
		System.out.println("in static block 2");
	}
	
	public static void m1() {
		System.out.println("y="+y);
		System.out.println("in static method");
	}
	
	static int y=20;
	
}
