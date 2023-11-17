package section_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanuch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\molle\\Downloads\\SETUP FILES\\chromedriver_win32");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=Xr8p17TKPc4&list=PLyTBh5FxMov7a6E0H9W_9I6SUW0JDkerI");
		
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=Xr8p17TKPc4&list=PLyTBh5FxMov7a6E0H9W_9I6SUW0JDkerI");
	
<<<<<<< HEAD
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=Xr8p17TKPc4&list=PLyTBh5FxMov7a6E0H9W_9I6SUW0JDkerI");
	
=======
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=Xr8p17TKPc4&list=PLyTBh5FxMov7a6E0H9W_9I6SUW0JDkerI");
	
		
>>>>>>> 9fbd7cb5585dabba5447975f3bcbd2ef51514752
	}

}
