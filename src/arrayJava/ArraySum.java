package arrayJava;

public class ArraySum {

	public static void main(String[] args) {
		
		int a[]={2,3,5,6};
		
		int sum=0;
		int avg=0;
		for(int i=0; i<a.length;i++){
			
				sum+=a[i];
				avg=sum/a.length;
				
			}		
		
		System.out.println("the sum is:"+ sum);
		System.out.println("the avg is"+avg);
		}
}


