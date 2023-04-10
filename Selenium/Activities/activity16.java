package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity16 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).
                sendKeys("password");
        driver.findElement(By.xpath("//label[text()= 'Confirm Password']/following-sibling::input"))
                .sendKeys("password");
        driver.findElement(By.xpath("//label[contains(text(), 'Email')]/following-sibling::input"))
                .sendKeys("1234@gmail.com");
        driver.findElement(By.xpath("//button[contains(text() , 'Sign Up')]")).click();
        String Confirmation_message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message: " + Confirmation_message);

    }

}
