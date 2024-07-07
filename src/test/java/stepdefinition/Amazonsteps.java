package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 

import io.cucumber.java.en.*;

public class Amazonsteps {
	
	WebDriver driver;
	String homePageTitle;
	String bestsellerPageTitle;
	String mobilePageTitle;
	String fashionPageTitle;
	
	@Given("Open Amazon application")
	public void open_amazon_application() {
		
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    System.out.println("Amazon Page opened successfully!");
	    
	}

	@When("User get the title of Homepage")
	public void user_get_the_title_of_homepage() {
		homePageTitle = driver.getTitle();
		System.out.println("Title of Amazon Homepage is: "+homePageTitle);	    
	}
	    

	@Then("Home page title matched")
	public void home_page_title_matched() {
		Assert.assertTrue(homePageTitle.contains("Online Shopping"), "Test Fail: Homepage title does not match!");
		System.out.println("Test Pass: Homepage title matched!");
	    
	}
	
	@Then("Quit the browswer")
	public void quit_the_browswer() {
	    driver.quit();
	}
	
	@When("User opens Bestseller page")
	public void user_opens_bestseller_page() {
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		System.out.println("Bestseller page Opened!");
	}

	@When("Get the title of Bestseller page")
	public void get_the_title_of_bestseller_page() {
		bestsellerPageTitle = driver.getTitle();
		System.out.println("Title of Bestseller page is: "+bestsellerPageTitle);
	}

	@Then("Bestseller page title matched")
	public void bestseller_page_title_matched() {
		Assert.assertTrue(bestsellerPageTitle.contains("Bestsellers"), "Test Fail: Title of Bestseller page does not match!");
		System.out.println("Test Pass: Title of Bestseller page matched!");
	}

	@When("User opens Mobile page")
	public void user_opens_mobile_page() {
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	    System.out.println("Mobile page opened!");
	}

	@When("Get the title of Mobile page")
	public void get_the_title_of_mobile_page() {
		mobilePageTitle = driver.getTitle();
		System.out.println("Title of Mobile page is: "+mobilePageTitle);
	}

	@Then("Mobile page title matched")
	public void mobile_page_title_matched() {
		Assert.assertTrue(mobilePageTitle.contains("Mobile Phones"), "Test Fail: Title of Mobile page does not match!");
		System.out.println("Test Pass: Title of Mobile page matched!");
	}

	@When("User opens Fashion page")
	public void user_opens_fashion_page() {
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		System.out.println("Fashion page opened");
	}

	@When("Get the title of Fashion page")
	public void get_the_title_of_fashion_page() {
		fashionPageTitle = driver.getTitle();
		System.out.println("Title of Fashion page is: "+fashionPageTitle);
	}

	@Then("Fashion page title matched")
	public void fashion_page_title_matched() {
		Assert.assertTrue(fashionPageTitle.contains("Amazon Fashion"), "Test Fail: Title of Fashion page does not match!");
		System.out.println("Test Pass: Title of Fashion page matched!");
	}

	
	

}
