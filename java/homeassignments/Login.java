package homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
	   String tit = driver.getTitle();
	    
	    System.out.println(tit);
	   driver.close();
	   
	   
	   EdgeDriver driver1 = new EdgeDriver();
		driver1.get("https://www.whatsappwebs.com/"); 
		driver1.manage().window().maximize();
	   String tit1 = driver1.getTitle();
	    
	    System.out.println(tit1);
	    
	   driver1.close();
	    

	}

}
