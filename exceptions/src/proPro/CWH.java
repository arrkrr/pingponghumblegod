package proPro;

class Thread1 extends Thread{
	public void run() {
		while (true) {
			try {
				Thread.sleep(300);  //slow down
			}catch(InterruptedException ie) {
				System.out.println("The thread is interrupted");
				ie.printStackTrace();
			}
			System.out.println("Hello");
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		while (true) {
			try {
				Thread.sleep(300);
			}catch(InterruptedException ie) {
				System.out.println("The thread is interrupted");
				ie.printStackTrace();
			}
			System.out.println("Good morning");
		}
	}
}

public class CWH {
	public static void main(String[]args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
