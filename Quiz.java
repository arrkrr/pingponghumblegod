package postmid;

public class Quiz implements Runnable{
	int threadnum;
	
	public Quiz(int num) {
		this.threadnum = num;
	}
	
	public void run() {
		System.out.println("Thread"+threadnum+" is running.");
	}
	public static void main(String[]args) {
		int n=9;
		for (int i=0; i<n; i++) {
			Quiz q = new Quiz(i+1);
			Thread t = new Thread(q);
			t.start();
		}
	}
}

	

