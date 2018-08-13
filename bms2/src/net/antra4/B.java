package net.antra4;

public class B {

	public synchronized void bar(A a)//b lock object thread 2
	{//t2 b lock
	System.out.println("Thread2 starts execution of bar() method");
	/*try
	{
	
		Thread.sleep(2000);
	}
	catch (InterruptedException e)
	{}*/
	System.out.println("Thread2 trying to call a.last()");
	a.last();
	}
	public synchronized void last()
	{
	System.out.println("inside B, this is last() method");
	}

}
