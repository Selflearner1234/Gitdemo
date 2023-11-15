package seleniumExceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidArguementExceptionDemo {
	
	/*	When we are using get( ) to launch a web application, we provide URL in get( ) , 
	    while providing URL , if URL don't have any "https" (or) "http" we get this exception.
	*/


	public static void main(String[] args) throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("www.qafox.com/software-testing-interview-questions-and-answers/");
	}

}
