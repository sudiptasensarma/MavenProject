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
	
	@Given("Open Application")
	public void open_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SudiptaSenSarma\\Documents\\chromedriver_win32(1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
	}
	

	@When("click signup url")
	public void click_signup_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Sign up!")).click();;
	}
	
	@When("Select follow courses in Activity")
	public void select_follow_courses_in_activity() {
	    driver.findElement(By.className("register-profile")).click();
	}
	
	@When("Enter First Nane {string}")
	public void enter_first_nane(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("registration_firstname")).sendKeys(string);
	}
	
	@When("Enter lastNAme {string}")
	public void enter_last_n_ame(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("registration_lastname")).sendKeys(string);
	}
	@When("enter valid password {string}")
	public void enter_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	
	@When("Enter Email id {string}")
	public void enter_email_id(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("registration_email")).sendKeys(string);
	}
	
	@When("Enter Username {string}")
	public void enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	}
	
	@When("Enter Password and confirm password {string}")
	public void enter_password_and_confirm_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass1")).sendKeys(string);
		driver.findElement(By.id("pass2")).sendKeys(string);
	}
	@When("Click on RegisterButton")
	public void click_on_register_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("registration_submit")).click();
		Thread.sleep(2000);
	}
	
	@Then("Registration Successful {string}")
	public void registration_successful(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    String ScrnName = driver.findElement(By.xpath("/html/body/main/section/div/ul/li")).getText();
	    String ExpectedScrnName = "Registration";
	    
	    Assert.assertEquals(ExpectedScrnName,ScrnName);
	    
	    String UName = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/p[1]")).getText();
	    if(UName.contains(string))
	    {
	    	System.out.println("Signup Successful");
	    }
	    else
	    {
	    	System.out.println("Signup Not successful");
	    }
	    driver.close();
	}
	
	@When("Enter UserName {string}")
	public void enter_user_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).sendKeys(string);
	}
	@When("Enter Password {string}")
	public void enter_password_muse(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}
	
	
	@When("Click on loginButton")
	public void click_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("form-login_submitAuth")).click();
	    Thread.sleep(2000);
	}
	
	@When("Ensure Successful Login {string}")
	public void ensure_successful_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    String logintxt= driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div[1]/div/article/div/p[1]")).getText();
	    if(logintxt.contains(string))
	    {
	    	System.out.println("Login Successful");
	    }
	    else
	    {
	    	System.out.println("Login Unsuccessful");
	    }
	}
	@Then("Ensure Email has been validated {string}")
	public void ensure_email_has_been_validated(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.className("dropdown-toggle")).click();
	    Thread.sleep(1000);
	    String emailid = driver.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
	    if (emailid.contains(string))
	    {
	    	System.out.println("Email Validated successfully");
	    }
	    else
	    {
	    	System.out.println("Email Validation Failed");
	    }
	    driver.close();
	}
	
	@When("Click HomePage")
	public void click_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[1]/li[1]/a")).click();
	}
	
	@When("Click Compose")
	public void click_compose() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Compose")).click();
	}
	@When("Enter Email detail")
	public void enter_email_detail() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("sudi");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/span/span/span/ul/li[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("compose_message_title")).sendKeys("Test Email");
	    Thread.sleep(2000);
	}
	
	@When("Click Send Message")
	public void click_send_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("compose_message_compose")).click();
	    Thread.sleep(2000);
	}
	
	@Then("Validate Mail sent")
	public void validate_mail_sent() {
	    // Write code here that turns the phrase above into concrete actions
	    String mailveri = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[1]")).getText();
	    if (mailveri.contains("The message has been sent to"))
	    {
	    	System.out.println("Mail sent successfully");
	    }
	    else
	    {
	    	System.out.println("Mail was not sent successfully");
	    }
	    driver.close();
	}
	

}

	
	
	