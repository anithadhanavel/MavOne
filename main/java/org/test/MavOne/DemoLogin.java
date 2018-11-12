package org.test.MavOne;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DemoLogin {
	static WebDriver  driver;
	@Given("^the usee is in guru login webpage$")
	public void the_usee_is_in_guru_login_webpage() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHOK\\eclipse-workspace\\MavOne\\driver\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("http://demo.guru99.com/V4/");
	}

	@When("^the user enter valid username and password$")
	public void the_user_enter_valid_username_and_password() {
	  driver.findElement(By.name("uid")).sendKeys("mngr162412");
	  driver.findElement(By.name("password")).sendKeys("EqanYpU");
	}

	@When("^click login button$")
	public void click_login_button() {
	 driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^the user should be in manager home page$")
	public void the_user_should_be_in_manager_home_page() {
	  Assert.assertTrue(driver.getCurrentUrl().contains("Managerdomepage"));
	}


}
