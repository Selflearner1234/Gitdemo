package section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewToursRegisteration {

	public static void main(String[] args) throws Throwable {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		Thread.sleep(3000);
		// //a[text()= "REGISTER"]
		driver.findElement(By.xpath("//a[text()= \"REGISTER\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Molleti");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("Narendra");
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("9640881104");
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("abcgmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("abccom");
		Thread.sleep(3000);
		driver.findElement(By.name("city")).sendKeys("hyd");
		Thread.sleep(3000);
		driver.findElement(By.name("state")).sendKeys("tg");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("500043");
		Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("abcgmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("hyd");
		Thread.sleep(3000);
		driver.findElement(By.name("confirmPassword")).sendKeys("hyd");
		//input[type="submit"]
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();





		








		
		


	}

}
