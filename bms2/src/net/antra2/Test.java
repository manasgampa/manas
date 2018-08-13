package net.antra2;
import java.util.Scanner;

import net.antra.*;

public class Test {

	public static void main(String[] args) {
		
		throw new MyCustomizedException("it is my own Exception");
		
		
	//	throw new ArithmeticException("/by zeros");
		
		/*try {
			
		String str="abc";
		int i=str.length();
		System.out.println(1/1);
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("in arthemetic catch block");
		}catch(NullPointerException e) {
			
			System.out.println("in main exception");
		}catch(Exception e) {
			
		}finally {
			System.out.println("in finally block");
		}*/
		
		
	}
	
	public static void doStuff() {
		
		
		System.out.println("do stuff");
		doMoreStuff();
	}
	//final finally finalize
	public static void doMoreStuff() {
		System.out.println(1/0);
		System.out.println("do more stuff");
	}
}








/*	Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int k=i/j;
System.out.println("div"+k);
try {

}catch(Exception e) {
	
}

int m=i+j;
int n=i-j;
System.out.println("add"+m);
System.out.println("sub"+n);
*/