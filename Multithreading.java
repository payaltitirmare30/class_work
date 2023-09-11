package com.multithreading;
/*Write a Java program to create multiple thread in Java.
 * Apply thread properties too.(priority,name)
 */

class Thread1 extends Thread{
	
	public void run() {
		
		Thread t = Thread.currentThread();
		System.out.println("Thread1 Priority "+ t.getPriority());
		System.out.println("Thread1 name "+ t.getName());		
	}
}

class Thread2 extends Thread{
	
      public void run() {
		
		Thread t = Thread.currentThread();
		System.out.println("Thread2 Priority "+ t.getPriority());
		System.out.println("Thread2 name "+ t.getName());		
	}
	
}
public class Multithreading {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread2();
		
	// Set priority and name for the Thread1
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setName("first thread");
		
	// Set priority and name for the Thread2	
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setName("second thread ");
		// Start both threads
		t1.start();		
		t2.start();
		
	}

}
