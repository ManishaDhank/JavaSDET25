package Booking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.booking.com/");
    }

    @Test(priority = 0, groups = {"smoke", "search"})
    public void searchDestination() throws InterruptedException {
        WebElement search = driver.findElement(By.name("ss"));
        search.sendKeys("New Delhi");
        Thread.sleep(1000);

        WebElement dateField = driver.findElement(By.xpath("//button[@data-testid='searchbox-dates-container']"));
        dateField.click();

        WebElement checkIn = driver.findElement(By.xpath("//span[@aria-label='Th 18 September 2025']"));
        checkIn.click();

        WebElement checkOut = driver.findElement(By.xpath("//span[@aria-label='Fr 19 September 2025']"));
        checkOut.click();

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
    }

    @Test(priority = 1, groups = {"regression", "hotel"})
    public void selectHotel() {
        WebElement hotelLink = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//a[contains(@data-testid,'title-link')]")));
        hotelLink.click();

        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    @Test(priority = 2, groups = {"regression", "booking"})
    public void selectRoom() throws InterruptedException {
        WebElement roomTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.hprt-table")));
        List<WebElement> dropdowns = roomTable.findElements(By.cssSelector("select.hprt-nos-select"));

        Select firstDropdown = new Select(dropdowns.get(0));
        firstDropdown.selectByValue("1");
        Thread.sleep(1000);

        WebElement reserveBtn = driver.findElement(By.xpath("//button[contains(@class,'js-reservation-button')]"));
        reserveBtn.click();
    }

    @Test(priority = 3, groups = {"smoke", "booking"})
    public void fillPersonalDetails() throws InterruptedException {
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Doe");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe123@gmail.com");

        WebElement phone = driver.findElement(By.name("phoneNumber"));
        phone.sendKeys("9784469446");

        WebElement details = driver.findElement(By.xpath("//button[@name='book']"));
        details.click();
    }

    @Test(priority = 4, groups = {"booking", "regression"})
    public void confirmBooking() throws InterruptedException {
        WebElement book = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//span[@class='bui-button__text js-button__text']")));
        book.click();
        Thread.sleep(2000);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
