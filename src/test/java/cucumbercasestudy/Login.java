package cucumbercasestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Login {
	WebDriver driver;
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\googledriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 
	}

	@Given("Enter the username in username field")
	public void enter_the_username_in_username_field() {
		 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("lalitha");
	}

	@Given("Enter the password in password field")
	public void enter_the_password_in_password_field() {
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password123");
	}

	@Given("Click Login")
	public void click_Login() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Given("Verify Login")
	public void verify_Login() {
		String title=driver.getTitle();
		Assert.assertEquals("Home",title);
		
	}


}
