package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity21 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Main window  : " +driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.id("launcher")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Second window  : " +driver.getWindowHandle());
        for (String handle: driver.getWindowHandles()
             ) {
            driver.switchTo().window(handle);

        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("actionButton")));
        System.out.println("Third  window  : " +driver.getWindowHandle());
        System.out.println("Title of the window : " +driver.getTitle());
        driver.findElement(By.id("actionButton")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for (String handles: driver.getWindowHandles()
             ) {
            driver.switchTo().window(handles);

        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
       WebElement newtab =  driver.findElement(By.className("content"));
        newtab.click();
        System.out.println(newtab.getText());

        driver.quit();
    }



}
