package dataStructures;
import java.util.Scanner;

public class Merging {
	Scanner s;
	Merging(){
		s = new Scanner(System.in);
	}
	public static void main(String[] args) {
		Merging merge = new Merging();
		System.out.println("First List:");
		int m = merge.inputSize();
		int A[] = merge.inputElements(m);
		if (!merge.validate(A, m)) {
			System.out.println("Given list is not in Sorted Order. Quitting the program");
			System.exit(m);
		}
		System.out.println("Second List:");
		int n = merge.inputSize();
		int B[] = merge.inputElements(n);
		if (!merge.validate(B, n)) {
			System.out.println("Given list is not in Sorted Order. Quitting the program");
			System.exit(n);
		}
		int C[] = merge.mergeLists(A, m, B, n);
		System.out.println("The merged list is:");
		merge.display(C, m+n);
	}
	int inputSize() {
		System.out.println("How many elements do you have in the list?");
		int size = s.nextInt();
		return(size);
	}
	int[] inputElements(int x) {
		System.out.println("Input "+x+" numbers in sorted order");
		int temp[] = new int[x];
		for (int i=0;i<x;i++)
			temp[i] = s.nextInt();
		return(temp);
	}
	boolean validate(int X[], int p) {
		for (int i=0;i<p-1;i++)
			if (X[i]>X[i+1])
				return false;
		return true;
	}
	int[] mergeLists(int A[], int m, int B[], int n) {
		int C[] = new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		while(i<m && j<n) {
			if (A[i]>B[j]) {
				C[k]=B[j];
				j++;k++;
			}else {
				C[k]=A[i];
				i++;
				k++;
			}
		}
		if (i<m)
			for(;i<m;i++,k++)
				C[k]=A[i];	
		else
			for(;j<n;j++,k++)
				C[k]=B[j];	
		
		return (C);
	}
	void display(int X[], int size) {
		for(int p=0;p<size;p++)
			System.out.println(X[p]);
	}

}













