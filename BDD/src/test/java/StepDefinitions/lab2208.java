package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.lab22_08;
import utils.DriverFactory;

import java.util.Map;

public class lab2208 {

    private lab22_08 registerPage = new lab22_08(DriverFactory.getDriver());

    @Given("User is on the Guru99 registration page")
    public void user_is_on_registration_page() {
        registerPage.openRegistrationPage();
    }

    @When("User enters registration details:")
    public void user_enters_registration_details(Map<String, String> data) throws InterruptedException {
        registerPage.fillForm(
                data.get("firstName"),
                data.get("lastName"),
                data.get("phone"),
                data.get("email"),
                data.get("address"),
                data.get("city"),
                data.get("state"),
                data.get("postalCode"),
                data.get("country"),
                data.get("username"),
                data.get("password"),
                data.get("confirmPassword")
        );
    }

    @Then("User submits the registration form")
    public void user_submits_registration_form() throws InterruptedException {
        registerPage.submitForm();
    }
}