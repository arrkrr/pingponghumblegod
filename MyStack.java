package postmid;

import java.util.Scanner;

public class MyStack {
	int stack[];
	Scanner s;
	int top = -1; 			//stack is empty
	int n;
	public static void main(String[]args) {
		int x;
		MyStack ms = new MyStack();
		do {
		ms.s = new Scanner(System.in);
		System.out.println("Choose your operation: \n1.Push\n2.Pop\n3.Display\n4.Check if stack is empty\n5.Check is stack is full\n6.Number of Elements in the stack\n7.Number of empty locations in the stack\n8.Exit\nInput your choice: ");
		x = ms.s.nextInt();
			if(x==1) {
				ms.size();
				ms.push();
			}else if(x==2) {
				ms.pop();
			}else if(x==3) {
				ms.display();
			}else if(x==4){
				ms.isEmpty();
			}else if(x==5){
				ms.isFull();
			}else if(x==6){
				ms.numOfElements();
			}else if(x==7) {
				ms.countEmpty();
			}else {
				System.out.println("Goodbye");
			}
		}while(x!=8);
	}
	void size(){
		s = new Scanner(System.in);
		System.out.println("What is the size of your array?");
		n = s.nextInt();	
		stack = new int[n];		
	}
	void push() {
		for (int i=0; i<n; i++) {
		if(top<(n-1)){		/*stack is not full*/
			top++;
			System.out.println("Enter an integer to push");
			stack[top] = s.nextInt();
			//System.out.println(stack[top]);
		}else {
			System.out.println("Cannot push, stack is full");
		}
		}
	}
	void pop() {
		if(top>-1) {
			System.out.println("The pop element is: "+stack[top]);
			top--;
		}else if(top==-1){
			System.out.println("Cannot pop, stack is empty");
		}
	}
	void display() {
		if(top!=-1) {
			System.out.println("The elements in the stack are: ");
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);
		}else{
			System.out.println("Stack is empty");
		}
	}
	void isEmpty() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is not empty");
		}
	}
	void isFull() {
		if(top==n-1)
			System.out.println("Stack is full");
		else
			System.out.println("Stack is not full");
	}
	void numOfElements() {
		System.out.println("There are"+(top+1)+"elements");
	}
	void countEmpty() {
		System.out.println("There are "+(n-1-top)+"empty slots");
	}
}
