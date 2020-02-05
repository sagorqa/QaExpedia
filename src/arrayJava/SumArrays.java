package arrayJava;

import java.util.Arrays;

public class SumArrays {

	public static void main(String[] args) {
		int a[]={12,5,6,9};
		int b[]={15,5,23,1};
		System.out.println(Arrays.toString(a));//print arrays
		int sum=0;//sum arrays
		for(int i=0; i<a.length;i++){
			sum+=a[i];
			System.out.println(sum);
			System.out.println(Arrays.equals(a,b));//compare arrays
			
		}
	}

}
