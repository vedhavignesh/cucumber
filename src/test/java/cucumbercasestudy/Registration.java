package cucumbercasestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;


public class Registration {
	WebDriver driver;
	@Given("user navigates to testmeapp")
	public void user_navigates_to_testmeapp() {
		 System.setProperty("webdriver.chrome.driver","C:\\googledriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.linkText("SignUp")).click();
	   
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String un) {
	    driver.findElement(By.name("userName")).sendKeys(un);
	}

	@Given("user enters the firstname as {string}")
	public void user_enters_the_firstname_as(String fn) {
		driver.findElement(By.name("firstName")).sendKeys(fn);
	}

	@Given("user enters the last name as {string}")
	public void user_enters_the_last_name_as(String ln) {
		driver.findElement(By.name("lastName")).sendKeys(ln);
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Given("user enters the confirm password as {string}")
	public void user_enters_the_confirm_password_as(String cmpwd) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cmpwd);
	}

	@Given("user selects the gender as {string}")
	public void user_selects_the_gender_as(String gender) {
		driver.findElement(By.xpath("//*[@id='gender']")).click();
	}

	@Given("user enters the email address as {string}")
	public void user_enters_the_email_address_as(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@Given("user enters the mobile number as {string}")
	public void user_enters_the_mobile_number_as(String mn) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mn);
	}

	@Given("user selects the date of birth as {string}")
	public void user_selects_the_date_of_birth_as(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@Given("user enters the address as {string}")
	public void user_enters_the_address_as(String add) {
		driver.findElement(By.name("address")).sendKeys(add);
	}

	@Given("user selects the security question")
	public void user_selects_the_security_question() {
		Select a=new Select(driver.findElement(By.xpath("//*[@id='securityQuestion']")));
		a.selectByIndex(1);
	}

	@Given("user enters the answer")
	public void user_enters_the_answer() {
		driver.findElement(By.name("answer")).sendKeys("red");
	}

	@Given("user clicks the register button")
	public void user_clicks_the_register_button() {
		driver.findElement(By.name("Submit")).click();
	}
	@Given("verify registration")
	public void verify_registration() {
		String title=driver.getTitle();
		Assert.assertEquals("Login",title);
	}
}
