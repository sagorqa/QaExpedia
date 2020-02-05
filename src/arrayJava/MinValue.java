package arrayJava;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size= obj.nextInt();
		
		int num[]= new int[size];
		
		for(int i=0; i<size;i++){
			System.out.println("Enter the value:"+i);
			num[i]=obj.nextInt();
		}
		int min=num[0];
		for(int i=0;i<num.length;i++){
			if(min>num[i])
				min=num[i];
			}
			
		
		System.out.println("Min value:"+ min);
	}

}
