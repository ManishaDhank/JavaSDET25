package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    loginpage lp = new loginpage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("user enters the username")
    public void user_enters_the_username() {
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");
    }

    @When("user enters the password")
    public void user_enters_the_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        button.click();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        WebElement admin = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//a[1]//span[1]")));
        if (admin.isDisplayed()) {
            System.out.println("User is on the home page");
        } else {
            System.out.println("User is not on the home page");
        }
    }

    @When("user enters the invalid password")
    public void user_enters_the_invalid_password() {
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("wrongpass"); // invalid password
    }

    @Then("user sees an error message for invalid credentials")
    public void an_error_message_is_displayed() {
        WebElement error = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")));
        String errorText = error.getText().trim();
        if (!errorText.equals("Invalid credentials")) {
            throw new AssertionError("Expected error message not found. Actual: " + errorText);
        }
        System.out.println("Login failed as expected. Error message: " + errorText);
    }

    @When("user enters the {string} and {string}")
    public void user_enters_the(String usernam, String password) {
        WebElement username1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("usernam")));
        username1.sendKeys(usernam);

        WebElement password1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password1.sendKeys(password);
        
        
    }
    @When("user enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
 
		
 
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
 
		for (Map<String, String> user : users) {

 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
			Thread.sleep(10000);
 
			String username = user.get("username");
			String password = user.get("password");
 
			WebElement username1 = driver.findElement(By.name("username"));
 
			Thread.sleep(4000);
 
			username1.sendKeys(username);
 
			Thread.sleep(2000);
 
			WebElement password1 = driver.findElement(By.name("password"));
 
			password1.sendKeys(password);
 
			Thread.sleep(2000);
 
			

 
	}
		
 
}@Given("the user is on the login page")
public void the_user_is_on_the_login_page() throws InterruptedException {
	// launch the application on the chrome browser
			Thread.sleep(10000);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			Thread.sleep(2000);

}

@When("the user enters username {string} and password {string}")
public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {

lp.enterCredentials(username, password);
}

@Then("the user should be naqvigated to the home page")
public void the_user_should_be_navigated_to_the_home_page() {
	lp.clickLogin();
}}