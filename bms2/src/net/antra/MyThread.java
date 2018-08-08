package net.antra;
//extends Thread
public class MyThread implements Runnable{
	
	
	public static void main(String[] args) {
		MyThread my1=new MyThread();
		Thread t1=new Thread(my1);
		t1.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		
	
		
		MyThread my2=new MyThread();
		Thread t2=new Thread(my2);
		t2.start();
		t2.setPriority(Thread.NORM_PRIORITY);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("in thread"+i);
		}
		
		
	}

}
