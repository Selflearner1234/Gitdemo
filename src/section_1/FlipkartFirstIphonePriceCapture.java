package section_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFirstIphonePriceCapture {

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
	//	//div[@class='_30jeq3 _1_WHN1']
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//body/div/div/div[3]/div/div[2]/div[2]/div/div[4]/div/div/div"));
		Thread.sleep(3000);
		System.out.println(price.getText());
		driver.close();
		
	}


	
	}


