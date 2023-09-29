
package dataStructures;
import java.util.Scanner;

public class Queue2 {

	int queue[];
	int front;
	int rear;
	int n;
	Scanner s;
	Queue2(){
		s = new Scanner(System.in);
		n=3;
		queue = new int[n];
		front = -1;
		rear = -1;
	}
	public static void main(String[] args) {
		Queue2 t = new Queue2();
		int choice;
		do {
			System.out.println("\n\nQueue Operations\n");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Delete All the Elements");
			System.out.println("5. Exit");
			System.out.println("\nInput your choice (1-5): ");
			choice = t.input();
			
			switch(choice) {
				case 1: t.insert();break;
				case 2: t.delete();break;
				case 3: t.display(); break;
				case 4: t.deleteAll();
			}
		}while (choice !=5);
		
	}
	int input() {
		System.out.print("Input: ");
		return (s.nextInt());
	}
	void insert() {
		if (rear==n-1)
			System.out.println("Cannot Insert, Queue is full");
		else {
			rear++;
			queue[rear] = input();
		}
	}
	void delete() {
		if (front==rear)  //Queue is empty
			System.out.println("Cannot delete, Queue is empty");
		else {
			System.out.println("The Deleted element is " + queue[front+1]);
			for (int i=1;i<=rear;i++)
				queue[i-1] = queue[i];
			rear--;
		}
	}
	
	void deleteAll() {
		rear = front;
		System.out.println("Successfully deleted all the elements");
	}
	
	void display() {
		if (front == rear) // Queue is empty
			System.out.println("Cannot display, Queue is empty");
		else {
			System.out.println("The elements in the Queue are ");
			for (int i=front+1;i<=rear;i++)
				System.out.print(queue[i]+"\t");
		}
		System.out.println("");
	}

}



