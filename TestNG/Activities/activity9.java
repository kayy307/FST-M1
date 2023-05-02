package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class activity9 {
    WebDriver driver;

    @BeforeClass
    public void beforeclass()
    {
        //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        Reporter.log("Starting the browser");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opening the page");
        System.out.println("Title of the page =  " +driver.getTitle());


    }
    @BeforeMethod
    public void before_method()
    {
        Reporter.log("Alert");
        driver.switchTo().defaultContent();
    }

    @Test(priority =0)
    public void simpleAlertTestCase()
    {
     Reporter.log("Simple alert testcase started");
     WebElement simple_alert  = driver.findElement(By.id("simple"));
     simple_alert.click();
     Reporter.log("simple alert is opened");
     String simple_alert_text =driver.switchTo().alert().getText();
     System.out.println(simple_alert_text);
     Reporter.log("Got simple alert text");
     Assert.assertEquals(simple_alert_text,"This is a JavaScript Alert!");
     Reporter.log("Accepted alert ");
     driver.switchTo().alert().accept();
     Reporter.log("alert got closed");



    }
    @Test(priority = 1)
    public void confirmAlertTestCase()
    {
        Reporter.log("confirm alert started");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm alert is opened");
       String confirm_text =  driver.switchTo().alert().getText();
       Reporter.log("Got confirm alert text ");
       System.out.println(confirm_text);
       Reporter.log("assert is statisfied ");
       Assert.assertEquals(confirm_text,"This is a JavaScript Confirmation!");
       Reporter.log("alert accepted");
       driver.switchTo().alert().accept();
       Reporter.log("closed the alert");
    }
    @Test(priority = 2)
    public void promptAlertTestCase()
    {
        Reporter.log("promptAlertTestCase() started |");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");
        String prompt_text =  driver.switchTo().alert().getText();
        System.out.println(prompt_text);
        Reporter.log("Alert text is: " + prompt_text + " |");

        Assert.assertEquals(prompt_text,"This is a JavaScript Prompt!");
        Reporter.log("Text entered in prompt alert |");
        driver.switchTo().alert().sendKeys("Hi");
        driver.switchTo().alert().accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");

    }
    @AfterClass

    public void aftermethod()

    {
        Reporter.log("browser closed");
        driver.quit();
    }

}
