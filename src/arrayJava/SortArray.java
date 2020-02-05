package arrayJava;

import java.util.Arrays;
// sort() and toString() for sorting values.
public class SortArray {

	public static void main(String[] args) {
		int a[]= new int[]{32,3,21,10,56};
		
			Arrays.sort(a);
			
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.binarySearch(a,21));
				 
			 }
	}


