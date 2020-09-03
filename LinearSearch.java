import java.util.*;

public class LinearSearch {
	
	public static int search(int[] arr, int num) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter how many elements to store : ");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements to store : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = in.nextInt();
			
		}
		
		System.out.println("Enter element to search : ");
		int num =in.nextInt();
		
		int result = search(arr, num) + 1;
		
		if(result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Found at : " + result);
		}
			
	}
	
}
