package net.antra4;

public class A {


	public synchronized void foo(B b)//a lock //thread 1 A lock
	{//t1 lock of A
		
		System.out.println("Thread1 starts execution of foo() method");
		/*try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{}
	*/
		System.out.println("Thread1 trying to call b.last()");
		b.last();
	}
	public synchronized void last()//thread 2 
	{
		System.out.println("inside A, this is last()method");
	}

}
