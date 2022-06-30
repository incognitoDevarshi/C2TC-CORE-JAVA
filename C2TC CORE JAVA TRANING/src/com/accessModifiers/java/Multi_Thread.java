package com.accessModifiers.java;

public class Multi_Thread {

	public static void main(String[] args) throws InterruptedException {
		
		Mythread t= new Mythread();
		t.start();
		t.join();
		t.wait(2000);
		t.notify();
		for (int i=0;i<10;i++) {
			
			System.out.println("Main Thread");
			
		}
	}

}

class Mythread extends Thread {
	
	public void run() {
		
		for (int i=0;i<10;i++) {
			
			System.out.println("Child Thread");
			
		}
//		try {
//			Thread.sleep(5000);
//		}catch(InterruptedException e) {
//	}
}
}