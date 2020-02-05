package arrayJav2;

import java.util.Arrays;

public class PracticeArr {

	public static void main(String[] args) {
		int x[]={12, 43, 73, 4, 23};
		int sum=0;
		for(int i=0; i<x.length; i++){
		sum+=x[i];	
		}
		System.out.println(sum);
		int y[]=x.clone();
		System.out.println(Arrays.toString(y));
	System.out.println(Arrays.equals(x, y));
	}
}

