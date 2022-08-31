package com.tcs.cucumber_project;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.Common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pom.Login;

public class StepDefinitions {
	WebDriver driver;
	Common common;
	String browser = "chrome";
	String appUrl = "https://www.shopclues.com/";

	@Before
	public void setup() {
		common = new Common();
		common.setupBrowser(browser, appUrl);
		this.driver = common.getDriver();

	}

	
	 @After public void tearDown() { common.quitBrowser(); }
	 

	@Given("I am in the given website")
	public void WebapplicationPage() {
		driver.navigate().to(appUrl);
	}

	@When("I see the Notification click on dont allow")
	public void i_should_close_the_notification() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")));

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")).click();
		System.out.println("successfully closed the push notification");
	}

	@Then("Hover on Home and Kitchen and click on curtain")
	public void Hover_Menu_curtain() {

		// Adding wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Login obj1 = new Login(driver);
		obj1.HomeandKitchen();
		System.out.println("Done Mouse hover on 'Home and Kitchen' from Menu");
	}

	@Then("switch the tab to curtains")
	public void switching_the_tabs() {
		Login obj2 = new Login(driver);
		try {
			obj2.SwitchTabs();
			System.out.println("switched to tab  curtains ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

@Then("click on the first visible product")
public void click_on_the_first_visible() {
	Login obj = new Login(driver);
	try {
		obj.Addcarttab();
		System.out.println("switched to tab add cart");
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("validate the successful message")
public void validate_the_successful_message() {
	System.out.println("123 Message validated successfully");
	Login obj4 = new Login(driver);
	obj4.titleValidation();
	System.out.println("Message validated successfully");
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
