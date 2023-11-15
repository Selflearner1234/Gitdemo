package section_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RubyExtractFromSeleniumDownloadPage {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			WebElement ele = driver.findElement(By.xpath("//body/div/main/div[3]/div[2]/div/div[2]/p[2]/a[contains(text(),'4.12.0 (August 31, 2023)')]"));
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.out.println("handled");
		}
		finally {
			driver.findElement(By.xpath("//body/div/main/div[3]/div[2]/div/div[2]/p[2]/a[contains(text(),'4.12.0 (August 31, 2023)')]")).click();
		}
	}
}
