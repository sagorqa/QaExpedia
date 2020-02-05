package arrayJava;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9};//copy one array to another
		int b[]={1,2,3};
		//int destination[]=null;
		int destination[]=Arrays.copyOf(b,b.length);//Arrays.copyOf
		//destination=b.clone();//copy using .clone()
		//System.out.println(Arrays.toString(destination));
		//System.arraycopy(a,0,destination,0,3);
		//System.out.println(Arrays.toString(destination));
		//destination=a;
		//destination[0]=5;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(destination));
		
	}
}