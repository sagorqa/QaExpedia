package arrayJava;
// find the smallest number using array[]
public class SmallestNo {

	public static void main(String[] args) {
		
		int []numbers={10, 50, 45, 06, 100};
		int smallest= numbers[0];
	
	for(int i=0;i<numbers.length;i++){
		if (numbers[i]<smallest)
			smallest=numbers[i];
		
	}
	System.out.println("smallest no of the arrays is:"+ smallest);
}
}