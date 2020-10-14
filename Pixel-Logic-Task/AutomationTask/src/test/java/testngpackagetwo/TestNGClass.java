package testngpackagetwo;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

import AutomationTask.AutomationTask.SeleniumPage;


public class TestNGClass extends SeleniumPage {

	public String baseUrl = "https://www.phptravels.net/register";
	public String loginUrl = "https://www.phptravels.net/login";
	SeleniumPage sp = new SeleniumPage();
	String driverPath = "Webdrivers\\\\chromedriver.exe";
	public WebDriver driver = new ChromeDriver();

	@AfterTest // Jumbled
	public void terminateBrowser() {
		driver.close();
	}

	@BeforeTest // Jumbled
	public void launchBrowser() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "Webdrivers\\chromedriver.exe");
		driver.get(baseUrl);
	}
	
	

	/*@Test // Jumbled
	public void verifyHomepageTitle() {
		String expectedTitle = "Register";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}*/
	
	
	@Test
    public void urlTest() throws IOException
    {
    	String expectedURL = "https://www.phptravels.net/register";
    	String actualURL = driver.getCurrentUrl();
    	Assert.assertEquals(actualURL, expectedURL);
    	
    }

//	@Test
//	public void verifyFirstNameNotEqualLastName() {
//		
//		sp.initiateAndOpenChrome(baseUrl);
//		sp.typeInFirstName("Omar");
//		sp.typeInLastName("Osama");
//		sp.typeInEmail("omar@yahoo.com");
//		sp.typeInPhone(01115777447);
//		sp.typeInPassord("Password");
//		sp.typeInConfirmPassord("Password");
//		//sp.pressSignUp();
//		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
//		//String firstNameTest = firstName.getText();
//		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
//		//String lastNameTest = lastName.getText();
//		Assert.assertNotEquals(firstName, lastName);
//        
//		
//	}
	
	/*@Test
	public void passwordConfirmation() {

		sp.initiateAndOpenChrome(baseUrl);
		sp.typeInFirstName("Omar");
		sp.typeInLastName("Osama");
		sp.typeInEmail("omar.osaleeh@gmail.com");
		sp.typeInPhone(01115777447);
		sp.typeInPassord("Password");
		sp.typeInConfirmPassord("Password");
		sp.pressSignUp();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		String passwordTest = password.getText();
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
		String confirmPasswordTest = confirmPassword.getText();
		Assert.assertEquals(passwordTest, confirmPasswordTest);

	}
	*/
	
	/*@Test
	public void successfulLogin()
	{
		sp.initiateAndOpenChrome(loginUrl);
		sp.loginEmail("omar.osaleeh@gmail.com");
		sp.loginPassword("Password");
		sp.loginButton();
		driver.get(loginUrl);
		String expectedTitle = "Login";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}*/
	
	

	/*@Test
	 * 
	 * Failed Test
	public void emailDoesnotExist() throws InterruptedException {

		sp.initiateAndOpenChrome(baseUrl);
		sp.typeInFirstName("Omar");
		sp.typeInLastName("Osama");
		sp.typeInEmail("omar.osaleeh@gmail.com");
		sp.typeInPhone(01115777447);
		sp.typeInPassord("Password");
		sp.typeInConfirmPassord("Password");
		sp.pressSignUp();
		Thread.sleep(10000);
		String expectedErrorMsg = "Email Already Exists.";
		//WebElement actual = driver.findElement(By.xpath(".//div[contains(@class,'alert alert-danger')]"));	
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(actualMessage, expectedErrorMsg);

	}
*/
//	@Test
// Failed Test
//	public void verifyFirstName() {
//		
//		sp.initiateAndOpenChrome(baseUrl);
//		sp.typeInFirstName("");
//		sp.typeInLastName("Osama");
//		sp.typeInEmail("omar.osaleeh@gmail.com");
//		sp.typeInPhone(01115777447);
//		sp.typeInPassord("Password");
//		sp.typeInConfirmPassord("Password");
//		sp.pressSignUp();
//		String expectedErrorMsg = "Please fill out this field.";
//		//WebElement exp = driver.findElement(By.xpath("//input[@name='firstname']"));		
//		//String actualErrorMsg = exp.getText();
//		String exp = driver.switchTo().alert().getText();
//      Assert.assertEquals(exp, expectedErrorMsg);
//		
//	}
//	
//	



}
