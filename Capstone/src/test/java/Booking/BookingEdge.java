package Booking;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BookingEdge {
	
	// Test Case 1: Positive Login Test
    @Test(priority = 0)
    public void Bookingflow() throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:/Users/Manisha/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
		driver.get("https://www.booking.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(2000);

    	// Enter destination
    	WebElement search = driver.findElement(By.name("ss"));
    	search.sendKeys("New Delhi");
    	Thread.sleep(1000);

    	// Click date field
    	WebElement dateField = driver.findElement(By.xpath("//button[@data-testid='searchbox-dates-container']"));
    	dateField.click();
    	Thread.sleep(1000);

    	// Pick check-in date (10 September 2025)
    	WebElement checkIn = driver.findElement(By.xpath("//span[@aria-label='Th 18 September 2025']"));
    	checkIn.click();

    	// Pick check-out date (11 September 2025)
    	WebElement checkOut = driver.findElement(By.xpath("//span[@aria-label='Fr 19 September 2025']"));
    	checkOut.click();
    	Thread.sleep(1000);

    	// Submit search
    	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
    	submit.click();
    	
    	
    	WebElement avl=driver.findElement(By.xpath("//*[@id=\"bodyconstraint-inner\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div/div[3]/div[2]/div/div[2]/a"));
    	avl.click();
    	Thread.sleep(1000);
    	String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }


        // Step 2: Wait for room table
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        WebElement roomTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.hprt-table")));

        // Step 3: Select first room from drop down
        
        List<WebElement> dropdowns = roomTable.findElements(By.cssSelector("select.hprt-nos-select"));
        
        Select firstDropdown = new Select(dropdowns.get(0));
        
        firstDropdown.selectByValue("1");
        
        WebElement re=driver.findElement(By.xpath("//button[contains(@class,'hp_rt_input px--fw-cta js-reservation-button')]"));
        re.click();
        Thread.sleep(1000);
        
     // Wait helper
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        // First name
        WebElement firstName = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        firstName.sendKeys("John");
        Thread.sleep(1000);

        // Last name
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Doe");
        Thread.sleep(1000);

        // Email address
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe123@gmail.com");
        Thread.sleep(1000);
        
        WebElement num=driver.findElement(By.name("phoneNumber"));
        num.sendKeys("9784469446");
        Thread.sleep(1000);
        
        WebElement details=driver.findElement(By.xpath("//button[@name='book']"));
        details.click();
        
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
       
     // Wait for popup and click the "Yes, continue" confirm button
      WebElement yes= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='bui-button bui-button--secondary']")));

     yes.click();
        Thread.sleep(1000);
        
        WebElement book=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='bui-button__text js-button__text']")));
        book.click();
        
        
        Thread.sleep(2000);
     
    }
  
        
       
}