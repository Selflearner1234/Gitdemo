package seleniumWebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommandsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		 * 	1. get() :
			• Used to open the specified URL’s web page
			• http:// needs to be provided, otherwise the specified URL won't get opened and we will get InvalidArguementException. 
		 *  */
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		
		//	Used to maximize the browser window size
		driver.manage().window().maximize();
		
		//	Used to manimize the browser window size
		// driver.manage().window().minimize();
		
		// findElement( ) is used to capture the address of single element
		// along with findElement(), we need use By.locatorName("value")
		// demo on "clickontogetalert" button
		
		//driver.findElement(By.id("alert1")).click();
		
		
		/*
		 * name() – Demo on search box " search in this blog" before the image and
		 * locating the text box and  sending some text "Narendra" into search box. 
		 */
		 driver.findElement(By.name("q")).sendKeys("Narendra");
		
		
		
		
		
		
		
	}

}
