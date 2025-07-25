package sorting;

public class InsertionSort {
	static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1,1,2,3,4,5};
		insertionSort(arr);
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}
