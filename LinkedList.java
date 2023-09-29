package dataStructures;
import java.util.Scanner;

public class LinkedList {
	Scanner s;
	Node front;
	Node rear;
	int count;
	LinkedList(){
		s = new Scanner(System.in);
		front = null;
		rear = null;
		count = 0;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int choice;
		do {
			System.out.println("\n\nLinked List Operations\n");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Delete All the Elements");
			System.out.println("5. Exit");
			System.out.println("\nInput your choice (1-5): ");
			choice = ll.inputChoice();
			
			switch(choice) {
				case 1: ll.insert();break;
				case 2: ll.delete();break;
				case 3: ll.display(); break;
				case 4: ll.deleteAll();
			}
		}while (choice !=5);
		
	}
	int inputChoice() {
		return (s.nextInt());
	}
	Node input() {
		Node temp = new Node();
		System.out.println("Input an integer: ");
		temp.data = s.nextInt(); // a number
		return temp;
	}
	void insert() {
		//when empty, no options. Insert it at the front & rear.
		Node temp = input();
		if (front==null) {
			front = temp;
			rear = temp;
			rear.link = null; //(front.link=null or temp.link=null)
		}else {
			//1. Front, 2. Rear, 3. At a position
				System.out.println("\n\nInsert Where?\n");
				System.out.println("1. Front");
				System.out.println("2. Rear");
				System.out.println("3. at a position");
				System.out.println("\nInput your choice (1-3): ");
				int choice = inputChoice();
				
				switch(choice) {
					case 1: insertFront(temp);break;
					case 2: insertRear(temp);break;
					case 3: insertAtAPosition(temp); break;
					default: System.out.println("Wrong input");
				}
			}
		}
	void insertFront(Node temp) {
		temp.link = front;
		front = temp;
		count++;
	}
	void insertRear(Node temp) {
		temp.link = null;
		rear.link = temp;
		rear = temp; //rear = rear.link;
		count++;
	}
	void insertAtAPosition(Node temp) {
		int pos;
		System.out.println("Insert the desired position: ");
		pos = s.nextInt();
		if (pos<1) {
			System.out.println("Position outside the range, element is inserted at the front");
			insertFront(temp);
		}else if (pos>count+1) {
			System.out.println("Position outside the range, element is inserted at the rear");
			insertRear(temp);
		}else if (pos==count+1){
			insertRear(temp);
		}else if (pos == 1){
			insertFront(temp);
		}else {
			int count=1;
			Node trav = front;
			while (count<pos-1) {
				trav = trav.link;
				count++;
			}
			temp.link = trav.link;
			trav.link = temp;
		}		
	}
	
	
	void deleteAll() {
		front = null;
		rear = null;
		count = 0;
		System.out.println("Leks stole all ur elements! Blame Him!");
		
	}
	
	void display() {
		Node temp = front;
		if (front == null) {
			System.out.println("The Linked List is Empty");
		}else {
		System.out.print("The elements in the Linked List are: ");
		while (temp!=null) {
			System.out.print(temp.data+"\n");
			temp = temp.link;
			}
		}
	}
	void delete() {
		if (front == null) {
			System.out.println("Linked List is empty, cannot delete.");
		}else if (front == rear && front != null){
			System.out.println(front.data + "is deleted");
			front = rear = null;
			count = 0;
		}else {
			System.out.println("\nWhere to delete\n");
			System.out.println("1. Front");
			System.out.println("2. Rear");
			System.out.println("3. At a position");
			System.out.println("4. By Value");
			System.out.println("Input your choice");
			int choice = s.nextInt();
			switch(choice) {
				case 1: deleteFront(); break;
				case 2: deleteRear(); break;
				case 3: deleteAtAPosition(); break;
				case 4: deleteByValue(); break;
				default: System.out.println("Wrong input, choose again");
			}
		}
	}
	void deleteFront() {
		Node temp = front;
		front = front.link;
		System.out.println(temp.data + "is deleted");
		count--;
	}
	void deleteRear() {
		Node trav = front;
		while (trav.link != rear) {
			trav = trav.link;
		}
		Node temp = rear;
		rear = trav;
		System.out.println(temp.data + "is deleted");
		rear.link = null; //trav.link=null
	}
	
	void deleteByValue() {			//too messy, somebody help
		System.out.println("Input a value to be deleted");
		int val = s.nextInt();
		if (front.data == val) {
			deleteFront();
		}else {
			Node trav = front;
			while (trav.link != null && trav.link.data != val) {
				trav = trav.link;
			}
			if(trav.link == null) {
				System.out.println("The element you entered is not in the list");
				display();
				delete();
			}else {
				Node temp = trav.link;
				if (temp == rear) {
					trav.link = null;
					rear = trav;
					System.out.println(temp.data + "is deleted");
				}else {
					trav.link = temp.link;
					System.out.println(temp.data + "is deleted");
				}
			}
		}
	}
	void deleteAtAPosition() {
		Node trav;
		Node temp;
		int song = 2;
		System.out.println("The number of elements available is: " + count);
		System.out.print("Input the position of the element you want to delete; ");
		int pos = s.nextInt(); //-1
		if (pos<1 || pos>count) {
			System.out.println("Can't you read numbers? Your position cannot be less than 1 or greater than "+count);
		}else if (pos==1) {
				deleteFront();
			}else if (pos == count) {
					deleteRear();
				}else {
					trav = front;
					while (song<pos) {
						trav = trav.link;
						song++;
					}
					temp = trav.link;
					System.out.println("The deleted element at position "+ pos + " is " + temp.data);
					trav.link = temp.link;
		}
			
	}
	   

}





















