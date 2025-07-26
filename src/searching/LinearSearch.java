package searching;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[] arr, int target) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array values:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		System.out.println("enter the target value: ");
		int target=sc.nextInt();
		int result = linearSearch(arr, target);
        if (result != -1)
            System.out.println("Target found at index: " + result);
        else
            System.out.println("Target not found");

	}

}
