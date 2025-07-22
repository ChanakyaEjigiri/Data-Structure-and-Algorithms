package Sorting;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swap=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1,1,2,3,4,5};
		bubbleSort(arr);
		for(int num: arr) {
			System.out.print(num+" ");
		}

	}

}
