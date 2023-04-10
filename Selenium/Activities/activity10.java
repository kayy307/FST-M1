package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity10 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println(  driver.getTitle());
        WebElement dynamiccheckbox = driver.findElement(By.xpath("//input[@class = 'willDisappear']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class = 'willDisappear']")));
        System.out.println(dynamiccheckbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//label[@class = 'willDisappear']")));
        System.out.println("Checkbox is displayed:" +dynamiccheckbox.isDisplayed());






    }
}