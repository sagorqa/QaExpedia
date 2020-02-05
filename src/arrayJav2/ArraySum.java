package arrayJav2;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("put the size");
		int size=sc.nextInt();
		
		int x[]=new int[size];
		
		for(int i=0; i<size;i++){
			System.out.println("put the value");
			x[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<x.length;i++){
			sum+=x[i];
		}
		System.out.println("the sum is=" + sum);
	}

	}


