package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class activity8 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Title: " + driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.id("toggleCheckbox")).click();

      WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toggleCheckbox")));
      System.out.println(checkbox.isDisplayed());
      checkbox.click();

        WebElement dynamiccheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//label[ text() = 'Dynamic Checkbox']")));
       System.out.println(checkbox.isDisplayed());



    }

}
