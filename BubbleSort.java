import java.util.*;

public class BubbleSort {
	
	void bubbleSort(int[] arr) {
		
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}
			}
		}
	}
	
	void printArray(int[] arr) {
		
		System.out.print("[");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("]");
	}
	
	
    public static void main(String[] args) {
    	
    	bottle o = new bottle();
    	
    	int[] arr = {3,2,1,9,7};
    	
    	System.out.print("Given Array  :");
    	o.printArray(arr);
    	
    	o.bubbleSort(arr);
    	
    	System.out.print("Sorted Array :");
    	o.printArray(arr);
    	
	}
		
}
