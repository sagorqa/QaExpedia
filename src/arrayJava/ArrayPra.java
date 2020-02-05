package arrayJava;

import java.util.Scanner;

public class ArrayPra {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("put the size");
	int size=sc.nextInt();
	
	int x[]=new int[size];
	for(int i=0; i<size; i++){
		System.out.println("put the value");
		x[i]=sc.nextInt();
	}
	int min=x[0];
	for(int i=0; i<x.length; i++){
		if(x[i]<min)min=x[i];
	}
	System.out.println(min);
		
	}

}
