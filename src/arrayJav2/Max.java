package arrayJav2;

public class Max {

	public static void main(String[] args) {
		int a[]={12,43,4,23};
		int max=0;
		
		for(int i=0;i<a.length;i++){
			if(max<a[i])max=a[i];
		}
		System.out.println(max);
	}
	
	}


