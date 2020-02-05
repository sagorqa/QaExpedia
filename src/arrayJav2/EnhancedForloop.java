package arrayJav2;

public class EnhancedForloop {
	public void name(){
		String a="10";
		int b=Integer.parseInt(a);
		System.out.println(b);
	}
	public static int sum(int c){
		return c;
		
	}
	static void name1(String s){
		System.out.println(s);
	}
	public static int min(){
		int x=20, y=10;
		int res=x-y;
		return res;
		
	}
	void math(int x, int y){
		int m= x+y;
		System.out.println(m);
	}

	public static void main(String[] args) {
		EnhancedForloop obj= new EnhancedForloop();
		obj.name();
		int x=sum(10);
		System.out.println(x);
		name1("sagor");
		int z=min();
		System.out.println(z);
		obj.math(5, 15);
	}
	
		}
	