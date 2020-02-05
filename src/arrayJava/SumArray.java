package arrayJava;
//sum two array and keep the result in 3rd array
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the Array size");
		int size=obj.nextInt();
		
		int a[]=new int[size];
		int b[]=new int[size];
		int res[]=new int[size];
		
		for(int i=0;i<size;i++){
			System.out.println("Enter the value of "+ i);
			a[i]=obj.nextInt();
		}
		for(int i=0; i<size;i++){
			System.out.println("Enter the value of"+i);
			b[i]=obj.nextInt();
		}
		for(int i=0;i<size;i++){
			res[i]=a[i]+b[i];
			System.out.println("The result is"+ res[i]);
		}
		
	}

}
