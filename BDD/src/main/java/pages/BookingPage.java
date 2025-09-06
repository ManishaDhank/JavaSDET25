package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class BookingPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators

    By dateField = By.xpath("//button[@data-testid='searchbox-dates-container']");
    By submitBtn = By.xpath("//button[@type='submit']");
    By hotelLink = By.xpath("//a[contains(@data-testid,'title-link')]");
    By roomTable = By.cssSelector("table.hprt-table");
    By reserveBtn = By.xpath("//button[contains(@class,'js-reservation-button')]");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By phone = By.name("phoneNumber");
    By detailsBtn = By.xpath("//button[@name='book']");
    By bookBtn = By.xpath("//span[@class='bui-button__text js-button__text']");

    public BookingPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Actions
    public void enterDestination(String city) {
    	 WebElement searchBox = wait.until(ExpectedConditions
    		        .visibilityOfElementLocated(By.name("ss")));
    		    searchBox.clear();
    		    searchBox.sendKeys(city);
    }

    public void selectDates(String checkIn, String checkOut) {
        driver.findElement(dateField).click();
        driver.findElement(By.xpath("//span[@aria-label='" + checkIn + "']")).click();
        driver.findElement(By.xpath("//span[@aria-label='" + checkOut + "']")).click();
    }

    public void search() {
        driver.findElement(submitBtn).click();
    }

    public void selectHotel() {
        WebElement hotel = wait.until(ExpectedConditions.elementToBeClickable(hotelLink));
        hotel.click();

        // Switch to new tab
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void selectRoom() {
        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(roomTable));
        List<WebElement> dropdowns = table.findElements(By.cssSelector("select.hprt-nos-select"));
        new Select(dropdowns.get(0)).selectByValue("1");
        driver.findElement(reserveBtn).click();
    }

    public void enterDetails(String fName, String lName, String mail, String mobile) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(phone).sendKeys(mobile);
        driver.findElement(detailsBtn).click();
    }

    public void confirmBooking() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bookBtn)).click();
    }
}
