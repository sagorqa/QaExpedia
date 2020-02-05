package arrayJava;

import java.util.Arrays;

public class MisPrac {

	public static void main(String[] args) {
		int a[]={12,3,5,6};
		int b[]={13,6,9,7};
		int c[]={};
		//c=Arrays.copyOf(a,a.length);
		c=b.clone();
		
		//a=b;
		System.out.println(Arrays.toString(b));
	}

}
