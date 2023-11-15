package section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFirstIphoneClick {

	public static void main(String[] args) throws Throwable { 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
			//  //button[text()="✕"]
			// //span[text()=\"✕\"]
		}
		
		catch(Exception e)
		{
			System.out.println("Expection handled");
		}
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[title=\"Search for products, brands and more\"]")).sendKeys("iphone");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 11 (Black, 128 GB)\"]")).click();


		

	}

}
