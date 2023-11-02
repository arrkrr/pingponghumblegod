package dataStructures;

public class SelectionSort extends SortingTemplate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ss = new SelectionSort();
		ss.input();
		System.out.println("The unsorted list is: ");
		ss.display();
		ss.sort();
		System.out.println("\nThe sorted list is: ");
		ss.display();
	}
	void sort() {
		for (int outer=0;outer<n;outer++) {
			int small = outer;
			for(int i=outer+1;i<=n-1;i++) 
				if (elements[small]>elements[i])
					small = i;
			int c = elements[outer];
			elements[outer] = elements[small];
			elements[small] = c;
		}
	}
}
