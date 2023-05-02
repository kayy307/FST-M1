package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class activity2 {
    WebDriver driver;


    @BeforeMethod
            public void beforemethod() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void testcase()
    {
        driver.get("https://www.training-support.net/selenium/target-practice");

        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Practice", driver.getTitle());
    }
    @Test
    public void testcase2() {
        WebElement blackButton = driver.findElement(By.xpath("//button[@contains(class =''ui black button)]"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");

    }
    @Test
    public void skip_testcase()
    {
        String text= driver.findElement(By.xpath("//div[@class ='sub header']")).getText();
        Assert.assertEquals("Practice" ,text);
        Assert.assertTrue(text.contains("Practice"));

    }
    @Test
    public void skip_test2()
    {
        throw new SkipException("skipping the test");
    }

    @AfterMethod
    public void aftermethod()
    {
        driver.quit();
    }

}
