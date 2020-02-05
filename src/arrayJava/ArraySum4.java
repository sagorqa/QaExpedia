package arrayJava;

public class ArraySum4 {

	public static void main(String[] args) {
		int a[]={1,3,5,7};
		int b[]={2,4,6,8};
		int res[]=new int[4];
		//res[0]=a[0]+b[0];
		
		for(int i=0;i<res.length;i++){
			res[i]=a[i]+b[i];
			System.out.println(res[i]);
		}

	}

}
