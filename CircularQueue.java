package dataStructures;
import java.util.Scanner;

public class CircularQueue {

	int cqueue[];
	int front;
	int rear;
	int n;
	Scanner s;
	CircularQueue(){
		s = new Scanner(System.in);
		n=6;
		cqueue = new int[n];
		front = 0;
		rear = 0;
	}
	public static void main(String[] args) {
		CircularQueue t = new CircularQueue();
		int choice;
		do {
			System.out.println("\n\nCircular Queue Operations\n");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Delete All the Elements");
			System.out.println("5. Number of empty slots");
			System.out.println("6. Number of elements");
			System.out.println("7. Number of life cycles finished"); //how many times did the CQ finish its cycles 
			System.out.println("8. Exit");
			System.out.println("\nInput your choice (1-8): ");
			choice = t.input();
			
			switch(choice) {
				case 1: t.insert(); break;
				case 2: t.delete(); break;
				case 3: t.display(); break;
				case 4: t.deleteAll(); break;
				case 5: t.emptyLocations(); break;
				case 6: t.numberOfElements(); break;
				case 7: t.numberOfCycles();
			}
		}while (choice !=8);
		
	}
	int input() {
		System.out.print("Input: ");
		return (s.nextInt());
	}
	
	void insert() {
		if ((rear+1)%n==front) // CQ is full
			System.out.println("Cannot Insert, Circular Queue is full");
		else {
			rear = (rear+1)%n;
			cqueue[rear] = input();
		}
	}
	void delete() {
		if (front==rear)  //Circular Queue is empty
			System.out.println("Cannot delete, Circular Queue is empty");
		else {
			front = (front+1)%n;
			System.out.println("The Deleted element is " + cqueue[front]);
		}
	}
	
	void deleteAll() {
		rear = front; // or even front = rear
		System.out.println("Successfully deleted all the elements");
	}
	
	void display() {
		if (front == rear) // Queue is empty
			System.out.println("Cannot display, Circular Queue is empty");
		else {
			System.out.println("The elements in the Queue are ");
			int i = front;
			do {
				i=(i+1)%n;
				System.out.print(cqueue[i]+"\t");
			}while (i!=rear);
		}
		System.out.println("");
	}
	
	void emptyLocations() {
		
	}
	void numberOfElements() {
		
	}
	void numberOfCycles() {
		
	}

}