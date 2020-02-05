package arrayJav2;

public class Asum {

	public static void main(String[] args) {
		int x[]={12,32,6, 13};
		int sum=0;
		for(int i=0; i<x.length; i++){
			sum+=x[i];
		}
		System.out.println(sum);
	}

}
