package dataStructures;
import java.util.Scanner;


public class QueueObj {//Queue using Dynamic Objects
	Node rear = null;
	Node front = null;
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		QueueObj t = new QueueObj();
		int choice;
		do {
			System.out.println("\n\nQueue Operations\n");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Delete All the Elements");
			System.out.println("5. Count the number of elements");
			System.out.println("6. Exit");
			System.out.println("\nInput your choice (1-5): ");
			choice = t.input();
			//help me!
			switch(choice) {
				case 1: t.insert();break;
				case 2: t.delete();break;
				case 3: t.display(); break;
				case 4: t.deleteAll(); break;
				case 5: t.countElements();
			}
		}while (choice !=6);
		
	}
	int input() {
		System.out.print("Input: ");
		return (s.nextInt());
	}
	void insert() {
		Node temp = new Node();
		temp.data = s.nextInt();
		temp.link = null;
		if (front == null) {
			front = temp;
			rear = temp;
		} else {
			rear.link = temp;
			rear = temp;
			// rear = rear.link;
		}
	
	}
	
	void delete() {
		if (front == null) {
			System.out.println(" Empty, cannot delete man");
		} else {
			Node temp = front;
		front = front.link;
		System.out.println("Deleted element is"+ temp.data);
		temp = null;
		if (front == null) {
			rear = front;// rear is null guys
		}
	}
}
	
	void display() {
		if (front == null) {
			System.out.println("Nothing inside");
		} else {
			Node temp = front;
			System.out.println("The elements in the Stack are:");
			while (temp!= null) {
				System.out.println(temp.data);
				temp = temp.link;
			}
		}
	}
	
	void deleteAll() {
		if (front == null) {
			rear = null;
			System.out.println("If front null rear also null, Hehe");
		}
	}
	
	void countElements() {
		if (front == null) {
			System.out.println("It has no Element!!!"); 
		} else {
			int count=0;
			Node temp = front;
			while (temp!= null) {
				count++;
				temp = temp.link;
				System.out.println("The number of Element in Queue is "+count);
			}
		}

	}
}
















































