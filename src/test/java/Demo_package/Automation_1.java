package Demo_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automation_1 {
	
	public static  WebDriver driver;
	
	public static void main(String[] args) {
		//how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
			//how to open the url
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
	}
	 
}
