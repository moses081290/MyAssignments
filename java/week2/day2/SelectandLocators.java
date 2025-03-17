package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectandLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//ChromeDriver driver = new ChromeDriver();
		
		
	//	 driver.findElement(By.className("ext-safari")).click();
		 
		 
		String rt = new String("tiugb");
		
		String name = "1234567890";
		
	          char[] charArray = name.toCharArray();
		
		       System.out.println(charArray);
		
		               for (int i = 0; i < charArray.length; i++) {
		            	   
		            	   System.out.println(charArray[8]);
						
					}
		

		               
		               
		               char charAt = name.charAt(7);
		               System.out.println(charAt);

	}

}
