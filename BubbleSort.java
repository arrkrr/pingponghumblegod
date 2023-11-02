package dataStructures;

public class BubbleSort extends SortingTemplate{

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.input();
		System.out.println("The unsorted list is: ");
		bs.display();
		bs.sort();
		System.out.println("\nThe sorted list is: ");
		bs.display();
	}
	void sort() {
		for (int outer=1;outer<n;outer++)
			for(int i=n-1;i>=outer;i--) 
				if (elements[i]<elements[i-1]) {
					int c = elements[i];
					elements[i] = elements[i-1];
					elements[i-1] = c;
				}	
	}
}





















