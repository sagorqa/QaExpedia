	package arrayJav2;

public class NullArray {

	public static void main(String[] args) {
		/*int a[]=new int[3];b
		if( a==null){
			System.out.println(a.length);
		}*/
		
		int a[]=new int[0];
		System.out.println(a.length);
		if(a.length==0){
			System.out.println("empty");
		}
		else
			System.out.println("not empty");
	}

}
