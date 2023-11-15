package section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_over_message {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement msg = driver.findElement(By.id("keepLoggedInCheckBox"));
	    String data = 	msg.getAttribute("title");
	    System.out.println(data);

//		//Handling the hover message@
//		WebElement address = driver.findElement(By.id("keepLoggedInCheckBox"));
//		String hoverMessage = address.getAttribute("title");
//		System.out.println(hoverMessage);
	}

}
