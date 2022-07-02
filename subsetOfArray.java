package Recursion;
import java.util.*;
// declare a function to calculate
public class subsetOfArray {
	public static void subset(int []arr) {
		// declare a list of list say 2d list named ans to store all subset array
		List<List<Integer>>ans=new ArrayList<>();
		//declare list which store each possible subset in list form
		List<Integer>temsubset=new ArrayList<>();
		// calling function to give all possible subset
		toFindSubset(arr,0,temsubset,ans);
		// printing 2d list ans which contain all subset.
		System.out.println(ans);
	}
	public static void toFindSubset(int arr[],int i,List<Integer>temsubset,List<List<Integer>>ans){
		// base condition
		if(i==arr.length) {
			ans.add(new ArrayList<Integer>(temsubset));
			//ans.add(temsubset);//dought? hai
			return;
		}
		temsubset.add(arr[i]);
		toFindSubset(arr,i+1,temsubset,ans);
		temsubset.remove(temsubset.size()-1);
		toFindSubset(arr,i+1,temsubset,ans);
	}
	public static void main(String...args) {
		//declare array
		int []arr= {1,2,3};
		//calling function
		subset(arr);
	}

}
