package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.util.Highlighter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver;
	SeleniumPageFactory pf;
	JavascriptExecutor js;

@Given("Open the browser")
public void open_the_browser() {
    driver=new ChromeDriver();
   driver.manage().window().maximize();
  
}

@Given("Go to the application")
public void go_to_the_application() {
	driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
}

@When("Put the valid user")
public void put_the_valid_user() {
	pf=new SeleniumPageFactory(driver);
	Highlighter.getColor(driver, pf.getUser(), "red");
	pf.getUser().sendKeys("student");
    //driver.findElement(By.xpath("//*[@name='username']")).sendKeys("student");
	
}

@When("Put the valid password")
public void put_the_valid_password() {
	pf=new SeleniumPageFactory(driver);
	Highlighter.getColor(driver, pf.getPassword(), "black");
	pf.getPassword().sendKeys("qa1234");
	//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("qa1234");
}

@When("Click on login btn")
public void click_on_login_btn()  {
	pf=new SeleniumPageFactory(driver);
	Highlighter.getColor(driver, pf.getLoginbtn(), "blue");
	//Thread.sleep(3000);
	pf.getLoginbtn().click();
	//driver.findElement(By.xpath("//*[@type='submit']")).click();
}

@Then("login should pass and logout button should visible")
public void check_the_login_status_as_pass() {
   //condition check=logout button should visible
	//driver.findElement(By.xpath("//*[text()='Log Out']"));
	
	pf=new SeleniumPageFactory(driver);
	SoftAssert sa = new SoftAssert();
	sa.assertTrue(pf.getLogoutbtn().isDisplayed());
	sa.assertAll();

}

@When("Put the invalid user")
public void put_the_invalid_user() {
	pf=new SeleniumPageFactory(driver);
	pf.getUser().sendKeys("zahid");
	//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("zahid");
}

@When("Put the invalid password")
public void put_the_invalid_password() {
	pf=new SeleniumPageFactory(driver);
	pf.getPassword().sendKeys("zahid1234");
	//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("zahid1234");
}

@Then("login should fail and error msg contains An internal error has occurred and has been logged.")
public void login_should_fail_and_error_msg_contains_An_internal_error_has_occurred_and_has_been_logged() {
	pf=new SeleniumPageFactory(driver);
	SoftAssert sa = new SoftAssert();
	sa.assertTrue(pf.getLogoutbtn().isDisplayed());
	sa.assertAll();
}

@When("Put the null user")
public void put_the_null_user() {
	pf=new SeleniumPageFactory(driver);
	pf.getUser().sendKeys("");
	//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("");
}

@When("Put the null password")
public void put_the_null_password() {
	pf=new SeleniumPageFactory(driver);
	pf.getPassword().sendKeys("");
	//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("");
}
@Then("login should fail and msg contains Please enter a username and password.")
public void login_should_fail_and_msg_contains_Please_enter_a_username_and_password() {
	pf=new SeleniumPageFactory(driver);
	SoftAssert sa = new SoftAssert();
	sa.assertTrue(pf.getLogoutbtn().isDisplayed());
	sa.assertAll();
	
}

	
}
