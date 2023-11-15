package section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiCreateCustomer {

	public static void main(String[] args) throws Throwable {
		//launching the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// maximizing the browser window
		driver.manage().window().maximize();
		// opening the Actitime web application using get() 
		driver.get("https://demo.actitime.com/login.do");
		// LOGIN 
		// locating the username textbox and entering "admin" into the textbox
		driver.findElement(By.name("username")).sendKeys("admin");
		// locating the password textbox and entering "manager" into the textbox
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// clicking on the login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		// clicking on tasks
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(3000);
		// clicking on add new
		driver.findElement(By.xpath("//div[text() = \"Add New\"]")).click();
		Thread.sleep(3000);
		// clicking on add new customer
		driver.findElement(By.xpath("//div[text() = \"+ New Customer\"]")).click();
		Thread.sleep(3000);
		// entering the customer name
		driver.findElement(By.cssSelector("input[class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")).sendKeys("abc");
		Thread.sleep(3000);
		// clicking on the add customer button
		driver.findElement(By.xpath("//div[text() = \"Create Customer\"]")).click();

		




		


	}

}
