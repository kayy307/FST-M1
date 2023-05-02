package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity1 {


    WebDriver driver;

    @BeforeMethod
    public void beforemethod() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }
    @Test
    public void test()
    {
        String title = driver.getTitle();
        System.out.println("Title of the website=" + title);
        Assert.assertEquals("Training Support", title);
        driver.findElement(By.id("about-link")).click();
        String newtitle = driver.getTitle();
        Assert.assertEquals(newtitle, "About Training Support");
    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
