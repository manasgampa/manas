package com.antra3;

class Car{

	protected int i,j;
	public Car() {}
	public Car(int x,int y) {
		i=x;
		j=y;
	}
}
public class Sample {

	public static void main(String[] args) {
		/*Car c=new Car();
		System.out.println(c.i);
		System.out.println(c.j);*/
        double a, b, c;

        a = 3.0/0;

        b = 0/4.0;

        c=0/0.0;



    System.out.println(a);

        System.out.println(b);

        System.out.println(c);
	}
}
