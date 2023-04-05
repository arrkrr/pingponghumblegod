package postmid;

import java.util.Scanner;

public class MyStack {
	int stack[];
	Scanner s;
	int top;
	int n;
	MyStack(){
		s = new Scanner(System.in);
		System.out.println("What is the size of your array?");
		n = s.nextInt();	
		stack = new int[n];		
		top = -1;	//stack is empty
	}
	public static void main(String[]args) {
		MyStack ms = new MyStack();
		ms.push();
		ms.push();
		ms.push();
		ms.push();
		ms.push();
		ms.display();
		ms.pop();
		ms.pop();
		ms.display();
	}
	void push() {
		if(top<(n-1)){		/*stack is not full*/
			top++;
			System.out.println("Enter an integer to push");
			stack[top] = s.nextInt();
		}else {
			System.out.println("Cannot push, stack is full");
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
}
