package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import AutomationTask.AutomationTask.SeleniumPage;

public class TestNGFile extends SeleniumPage {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";

	@Test
	/*public void verifyHomepageTitle() {

		System.setProperty("webdriver.chrome.driver", "Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedTitle = "Register";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
*/
	@AfterTest                            //Jumbled
    public void terminateBrowser(){
        driver.close();
    }
   @BeforeTest                            //Jumbled
    public void launchBrowser() {
        System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver", "Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test                                //Jumbled
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
   }
}
