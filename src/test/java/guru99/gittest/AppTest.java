package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;


public class AppTest 
    
{
    public WebDriver driver;
    @Test
    public void guru99tutorials() throws InterruptedException  {
   
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String eTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		String aTitle = "";
		
		driver.get("http://www.guru99.com/");
		driver.manage().window().maximize();
		
		aTitle = driver.getTitle();
		if(aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
    }
 
}
