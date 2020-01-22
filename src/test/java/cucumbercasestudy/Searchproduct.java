package cucumbercasestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Searchproduct {
	WebDriver driver;
	@Given("User login into application")
	public void user_login_into_application() {
		 System.setProperty("webdriver.chrome.driver","C:\\googledriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("lalitha");
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password123");
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Given("User searches for the available product")
	public void user_searches_for_the_available_product() {
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys("Headphone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Given("Search product successful")
	public void search_product_successful() {
		String title=driver.getTitle();
		Assert.assertEquals("Search",title);
		
	}



}
