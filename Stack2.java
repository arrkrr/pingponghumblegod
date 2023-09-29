package dataStructures; //Stack using Dynamic Objects

import java.util.Scanner;

public class Stack2 {

	Node top = null;
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void push() {
		Node temp = new Node();
		temp.data = s.nextInt();
		temp.link = top;
		top = temp;
	}
	
	void pop() {
		Node temp = top;
		top = temp.link; // top = top.link;
		System.out.println("The popped element is "+ temp.data);
		temp = null;
	}
	
	void display() {
		Node temp = top;
		System.out.println("The elements in the Stack are:");
		while (temp!= null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
		
	}

}















































