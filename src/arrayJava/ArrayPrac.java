package arrayJava;

import java.util.Scanner;

public class ArrayPrac {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[];
		a=new int[3];
		
		System.out.println("put the first value of a");
		a[0]=obj.nextInt();
		System.out.println("put the second value of a");
		a[0]=obj.nextInt();
		System.out.println("put the third value of a");
		a[0]=obj.nextInt();
		
		int smallest= a[0];
		
		for(int i=0;i<a.length;i++){
			if (a[i]<smallest){
				smallest=a[i];
			}
		}
		System.out.println(smallest);
	}
}