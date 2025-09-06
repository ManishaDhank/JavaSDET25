package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BookingPage;

public class BookingSteps {

    WebDriver driver;
    BookingPage bookingPage;

    @Given("user opens booking website")
    public void openWebsite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        bookingPage = new BookingPage(driver);
    }

    @When("user searches for {string} from {string} to {string}")
    public void searchHotel(String city, String checkIn, String checkOut) {
        bookingPage.enterDestination(city);
        bookingPage.selectDates(checkIn, checkOut);
        bookingPage.search();
    }

    @And("user selects a hotel")
    public void selectHotel() {
        bookingPage.selectHotel();
    }

    @And("user selects a room")
    public void selectRoom() {
        bookingPage.selectRoom();
    }

    @And("user fills personal details {string} {string} {string} {string}")
    public void fillDetails(String fName, String lName, String email, String phone) {
        bookingPage.enterDetails(fName, lName, email, phone);
    }

    @Then("user confirms the booking")
    public void confirmBooking() {
        bookingPage.confirmBooking();
        driver.quit();
    }
}
