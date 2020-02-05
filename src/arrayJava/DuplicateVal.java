package arrayJava;

public class DuplicateVal {

	public static void main(String[] args) {
		int a[]={5,7,9,7,10};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<i;j++){
				if((a[i]==a[j])&&( i!= j))
					System.out.println(a[i]);
			}
			
		}
		
	}
			
		}

	


