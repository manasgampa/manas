package net.antra4;

public class DeadLock implements Runnable{
	A a=new A();
	B b=new B();
	DeadLock()
	{
		Thread t=new Thread(this);
		t.start();
		a.foo(b);//main thread//a clock
	}
	public void run()
	{//t2
		b.bar(a);//child thread//b lock
	}
	public static void main(String[] args)
	{
		new DeadLock();//main thread
	}

}
