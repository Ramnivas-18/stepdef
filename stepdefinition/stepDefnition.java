package org.stepdefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefnition extends BaseClass {

	public WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://testing.inconn.com:8080/login");
		driver.manage().window().maximize();

	}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		driver.findElement(By.xpath("//input[@id='input-15']")).sendKeys("test@inconn.com");
		driver.findElement(By.xpath("//input[@id='input-18']")).sendKeys("test@321");
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	@Then("user click the configuration button")
	public void user_click_the_configuration_button() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Configuration']")).click();
	}

	// span[@class='v-btn__content'])[7]
	@Then("User clcik the buisness setup button")
	public void user_clcik_the_buisness_setup_button() {
		driver.findElement(By.xpath("//div[text()='Business Setup']")).click();
	}

	@Then("user click zone button")
	public void user_click_zone_button() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Business Setup']")).click();

	}

	@Then("user click site button")
	public void user_click_site_button() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Zone']")).click();
	}

	@Then("user should click the add root button")
	public void user_should_click_the_add_root_button() {
		driver.findElement(By.xpath("//span[text()='Add Root']")).click();

	}

	@Then("user should enter the zone name")
	public void user_should_enter_the_zone_name() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("theni");
	
	}

	@Then("user should enter the zone description")
	public void user_should_enter_the_zone_description() {
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("automation site");
	}

	@Then("user should click the save button")
	public void user_should_click_the_save_button() {
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/span/button/span")).click();

	}
	// input[@id='input-270']
	
}

