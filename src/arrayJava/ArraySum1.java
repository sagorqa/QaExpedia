package arrayJava;

import java.util.Scanner;

public class ArraySum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++){
			System.out.println("numbers");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
		sum+=a[i];
		}
		System.out.println(sum);
		}

	}


