package arrayJava;

public class SumArr {

	public static void main(String[] args) {
		int a[][]={{2,3,5},{6,7,8}};
		int b[][]={{4,5,7},{7,8,3}};
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++)
			//sum+=a[i][j];
			//System.out.println(sum);
		
		
			sum+=a[i][j];
			//System.out.print(sum);
		}
		System.out.println(sum);
	}

}
