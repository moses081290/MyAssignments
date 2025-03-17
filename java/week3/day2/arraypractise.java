package week3.day2;

import java.util.Iterator;

public class arraypractise {
	
	public static void main(String[] args) {
		
		int number[] ={1,3,5,7,9,};
		
		int number1[]= {2,3,4,7,9};
		
		for (int i = 0; i < number.length; i++) {
			
			for (int j = 0; j < number1.length; j++) {
				
				if(number[i]==number1[j])
					
				{
					System.out.println("inersection is :" + number[i]);
				}
				
			}
			
		}
		
		
	}
	

}
