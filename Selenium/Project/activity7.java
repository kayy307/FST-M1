package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class activity7 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.findElement(By.id("grouptab_0")).click();
      driver.findElement(By.id("moduleTab_9_Leads")).click();
        Actions click = new Actions(driver);
        Thread.sleep(2000);
        WebElement details = driver.findElement(By.xpath("(//span[@title ='Additional Details'])[10]"));
        click.moveToElement(details).click().build().perform();
        Thread.sleep(1000);
        WebElement  phone_number = driver.findElement(By.xpath("//span[@class='phone']"));
        Thread.sleep(1000);
        System.out.println(phone_number.getText());
        driver.quit();



    }}


