package arrayJava;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=obj.nextInt();
		int c[]=new int[size];
		
		System.out.println("enter the value of a");
		int a[]={obj.nextInt()};
		System.out.println("enter the value of b");
		int b[]={obj.nextInt()};
		c[size]=a[size]+b[size];
		System.out.println(c[size]);
	}

}
