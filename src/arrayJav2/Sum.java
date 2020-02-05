package arrayJav2;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		int a[]={12,43,3,6,41};
		System.out.println(Arrays.toString(a));
		int sum=0;
		for(int i=0;i<a.length;i++){
		sum+=a[i];
		
	}
		System.out.println("sum is"+sum);
	}
}
