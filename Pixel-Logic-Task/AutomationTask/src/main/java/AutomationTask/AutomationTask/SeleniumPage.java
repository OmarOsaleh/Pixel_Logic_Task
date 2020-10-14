package AutomationTask.AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPage {

	WebDriver driver = null;

	public SeleniumPage() {
		System.setProperty("webdriver.chrome.driver", "Webdrivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	public void initiateAndOpenChrome(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}

	public void typeInFirstName(String firstname) {

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);

	}
	
	public void typeInLastName(String lastname) {

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);

	}
	
	public void typeInPhone(int phonenumber) {

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(phonenumber));

	}
	
	public void typeInEmail(String email) {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);

	}
	
	public void typeInPassord(String password) {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	
	public void typeInConfirmPassord(String password) {

		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys(password);
	}
	
	public void pressSignUp() {

		WebElement signup = driver.findElement(By.xpath("//button[contains(@class,'signupbtn btn_full btn btn-success btn-block btn-lg')]"));
		signup.click();
		
		
	}
	
	public void loginEmail(String Email) {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Email);
	}
	
	
	public void loginPassword(String password) {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	public void loginButton() {

		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary btn-lg btn-block loginbtn')]"));
		login.click();
	}
	
	
	

	
	
	
	

}
