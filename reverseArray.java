package Recursion;

public class reverseArray {
	public static void reverseArray(int arr[] ,int l,int r){
		//base condition
		if(l>r) {
			return;
		}
		//small task
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		//rest work via recursion
		reverseArray(arr,l+1,r-1);
	}
	public static void main(String args[]) {
		int []num= {3,5,6,7,9};
		System.out.println("original array");
		for(int n:num) {
			System.out.print(n);
		}
		int l=0;
		int r=num.length-1;
		reverseArray(num,l,r);
		System.out.println();
		System.out.println("array after reversed");
		for(int n:num) {
			System.out.print(n);
		}
		
	}

}
