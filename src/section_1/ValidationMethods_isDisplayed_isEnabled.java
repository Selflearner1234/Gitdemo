package section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods_isDisplayed_isEnabled {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		WebElement msg = driver.findElement(By.className("errormsg"));
		if (msg.isEnabled())
	    {
	    	System.out.println("Attribute is enabled");
	    }
	    else {
	    	System.out.println(" Attribute isnot enabled");
	    }
		
		if (msg.isDisplayed())
	    {
	    	System.out.println("isDisplayed");
	    }
	    else {
	    	System.out.println(" not isDisplayed");
	    }
	}

}
