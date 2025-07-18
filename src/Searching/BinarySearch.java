package Searching;
import java.util.Scanner;
public class BinarySearch {
	public static int binarySearch(int[] arr, int target) {
		int l=0;
		int len=arr.length;
		int r=len-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the sorted array values:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		System.out.println("enter the target value: ");
		int target=sc.nextInt();
		int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Target found at index: " + result);
        else
            System.out.println("Target not found");
		
	}

}
