package searching;

import java.util.Scanner;

public class FibonacciSearch {
	private static int fibonacciSearch(int[] arr, int target) {
		int fm2=0;
		int fm1=1;
		int fm=fm2+fm1;
		int n=arr.length;
		while(fm<n){
			fm2=fm1;
			fm1=fm;
			fm=fm1+fm2;
		}
		int offSet=-1;
		while(fm>1) {
			int i=Math.min((fm2+offSet), n-1);
			if(arr[i]<target) {
				fm=fm1;
				fm1=fm2;
				fm2=fm-fm1;
				offSet=i;
			}
			else if(arr[i]>target) {
				fm=fm2;
				fm1=fm1-fm2;
				fm2=fm-fm1;
			}
			else {
				return i;
			}
		}
		if (fm1 == 1 && offSet + 1 < n && arr[offSet + 1] == target) {
		    return offSet + 1;
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
		int result = fibonacciSearch(arr, target);
        if (result != -1)
            System.out.println("Target found at index: " + result);
        else
            System.out.println("Target not found");
	}



}
