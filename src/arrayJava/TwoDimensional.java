package arrayJava;
//Take 2 two dimensional arrays and keep their sum to another two dimensional array.
public class TwoDimensional {

	public static void main(String[] args) {
		int a[][]={{2,3},{6,7}};
		int b[][]={{4,5},{7,8}};
		int c[][]=new int[2][2];
		
		for (int i=0;i<a.length;i++){
			for(int j=0; j<2;j++){
				c[i][j]=a[i][j]+b[i][j];
				
			System.out.print(c[i][j]+" ");
		}
		System.out.println( );	
		}
		//System.out.println();
	}
	}

	


