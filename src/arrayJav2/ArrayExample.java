package arrayJav2;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		//find the length of Arrays
		
				int x[]={12,13,5,18,6};
				int size=x.length;//variable.length
				System.out.println(size);
				//System.out.println("");
		// copy the arrays
				String y=Arrays.toString(x);
				
				System.out.println(y);
				System.out.println("");
				//print arrays using for loop
				for(int i=0; i<x.length;i++){
					
					System.out.println(x[i]);
					System.out.println("");
					//enhanced for loop
				String name[]={"sagor","hena","Tahmeed"};	
					for(String names: name){
						System.out.println(names);
						
						String abc=Arrays.toString(name);
						System.out.println(abc);
				//check if the array contains certain value or not
						//(it returns boolean type result
						boolean boo=Arrays.asList(name).contains("sagor");
						boolean boom=Arrays.asList(name).contains("Ahmed");
						System.out.println(boo);//true
						System.out.println(boom);//false
					}
				}
			}

		}


	


