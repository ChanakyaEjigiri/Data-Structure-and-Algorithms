package sorting;

public class Mergesort {
	static void mergeSort(int[] arr,int l,int r) {
		if(l<r) {
			int mid=l+(r-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int n1=mid-l+1;
		int n2=r-mid;
		
		int[] lArr=new int[n1];
		int[] rArr=new int[n2];
		
		for(int idx=0;idx<n1;idx++) {
			lArr[idx]=arr[l+idx];
			
		}
		for(int idx=0;idx<n2;idx++) {
			rArr[idx]=arr[mid+1+idx];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(lArr[i]<rArr[j]) {
				arr[k]=lArr[i];
				i++;
			}
			else {
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=lArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] arr= {5,3,7,2,6,8,3};
		mergeSort(arr, 0, arr.length-1);
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}
