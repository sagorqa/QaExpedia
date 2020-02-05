package arrayJava;

import java.util.Arrays;

public class ArrayMis {

	public static void main(String[] args) {
		int a[]={12,54,6,43,25};
		int b[]={23,18,9,8,54};
		 b=a;
		 a=b;
		//for(int i=0;i<a.length;i++){
			//System.out.println(a[i]);
		//}
		//for(int i:a){
			//System.out.println(i);
		//}
		System.out.println(Arrays.toString(a));//toString()
		System.out.println(Arrays.equals(a, b));
		
		
		
	}

}
