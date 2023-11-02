package dataStructures;
import java.util.Scanner;

public class SortingTemplate {
	int n;
	int elements[];
	Scanner s;
	SortingTemplate(){
		s = new Scanner(System.in);
	}
	void input() {
		System.out.println("How many elements do you want to sort?");
		n = s.nextInt();
		elements = new int[n];
		System.out.println("Input "+n+" unsorted integers");
		for (int i=0;i<n;i++)
			elements[i]=s.nextInt();
	}
	void sort() {
		
	}
	void display() {
		//System.out.println("The elements in the list are:");
		for (int i=0;i<n;i++)
			System.out.print(elements[i]+"  ");
	}

}


//public static void main(String[] args) {
//		SortingTemplate st = new SortingTemplate();
//		st.input();
//		st.display();
//	}