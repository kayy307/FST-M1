package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity9 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/ajax");
        driver.getTitle();
        driver.findElement(By.xpath("//button[contains(@class , 'ui violet button')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement Hello = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        System.out.println(Hello.getText());
        WebElement ajax = driver.findElement(By.tagName("h3"));
        System.out.println(ajax.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String text = driver.findElement(By.tagName("h3")).getText();
        System.out.println(text);
        driver.quit();




    }
}