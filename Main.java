package postmid;

public class Main extends Thread{
	public void run() {
		for (int i=0; i<=50; i++) {
			System.out.println("Run: "+i);
		}
	}
	public static void main(String[]args) {
		Main mt = new Main();
		mt.run();
		mt.start();
		for (int i=0; i<=50; i++) {
			System.out.println("Main: "+i);
		}
	}
}
