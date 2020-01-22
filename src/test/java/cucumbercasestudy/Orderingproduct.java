package cucumbercasestudy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Orderingproduct {
	WebDriver driver;
	@Given("User login to the application")
	public void user_login_to_the_application() {
		 System.setProperty("webdriver.chrome.driver","C:\\googledriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("lalitha");
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password123");
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		  driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys("Headphone");
			driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		  
	}

	@Given("User ordering product without adding to cart")
	public void user_ordering_product_without_adding_to_cart() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.close();
	}

	
}
