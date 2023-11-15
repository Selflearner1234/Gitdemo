package section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods_isSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement msg = driver.findElement(By.id("keepLoggedInCheckBox"));
	  // msg.click();
	    Boolean status = msg.isSelected();
	    if (status)
	    {
	    	System.out.println("checked");
	    }
	    else {
	    	System.out.println("not checked");
	    }
	}

}
