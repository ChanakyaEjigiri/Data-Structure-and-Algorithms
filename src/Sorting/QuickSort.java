package Sorting;

public class QuickSort {
	private static void quickSort(int[] arr, int l, int r) {
		if(l<r) {
			int pi=partition(arr,l,r);
			quickSort(arr, l, pi-1);
			quickSort(arr, pi+1, r);
		}
		
	}

	private static int partition(int[] arr, int l, int r) {
		int pivot=arr[r];
		int i=l-1;
		for(int j=l;j<=r-1;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[r];
		arr[r]=arr[i+1];
		arr[i+1]=temp;
		return i+1;
	}

	public static void main(String[] args) {
		int[] arr= {5,4,7,2,9,10,3};
		int n=arr.length;
		quickSort(arr,0,n-1);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

	

}
