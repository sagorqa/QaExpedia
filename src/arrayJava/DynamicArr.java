package arrayJava;

import java.util.Scanner;

public class DynamicArr {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		
		System.out.println("put the array size");
		int size= obj.nextInt();
		int a[]=new int[size];
		
		for(int i=0; i<size;i++){
			
			System.out.println(i);
			a[i]=obj.nextInt();
			
		}
	}

}
