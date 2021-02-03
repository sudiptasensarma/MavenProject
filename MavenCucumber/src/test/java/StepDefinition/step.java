package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class step {
WebDriver driver;
	@Given("Login application")
	public void login_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SudiptaSenSarma\\Documents\\chromedriver_win32(1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
	@When("enter valid username")
	public void enter_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	    
	}
	@When("enter valid password")
	public void enter_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	}
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}
	@Then("login successful")
	public void login_successful() {
	    // Write code here that turns the phrase above into concrete actions
		String expected = driver.findElement(By.id("welcome")).getText();
		System.out.println(expected);
		String actual = "Welcome Paul";
		Assert.assertEquals(expected,actual);
			   
	}
	@Then("user navigates to the homepage")
	public void user_navigates_to_the_homepage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		if(driver.findElement(By.id("welcome")).isDisplayed())
		{
			driver.findElement(By.id("welcome")).click();
			if (driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[1]/a")).isDisplayed())
			{
				driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[1]/a")).click();
				System.out.println(" element clicked");
				Thread.sleep(2000);
			}
			else
			{
				System.out.print("List element not identified");
			}
		}
		else
		{
			System.out.print("Welcome not found");
		}
		
        driver.close();
	    //throw new PendingException();
	    
	}

	@When("enter invalid username an dpassword")
	public void enter_invalid_username_an_dpassword() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("sudipta");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
	    
	}
	@Then("login unsuccessful")
	public void login_unsuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		String expected = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		System.out.println(expected);
		String actual = "Invalid credentials";
		Assert.assertEquals(expected,actual);   
		driver.close();
	}



}
