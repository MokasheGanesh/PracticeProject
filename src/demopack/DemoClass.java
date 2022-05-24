package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoClass 
{


	//public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
		@BeforeClass
		public void openBrowser() 
		{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
//		 driver = new ChromeDriver();
//		
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			System.out.println("openBrowser");
		}
		@Test 
		public void test()
		{
		
//		LoginPage login= new LoginPage(driver);
//				  login.sendUserName();
//				  login.sendPassword();
			System.out.println("test");
		}
		
		@AfterClass
		public void closeBrowser() 
		{
			System.out.println("closeBrowser");
		// driver.quit();
		}
		

}
