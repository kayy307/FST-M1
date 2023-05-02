package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class activity7 {
    WebDriver driver;
    @BeforeMethod
    public void beforemethod() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
        System.out.println(driver.getTitle());
    }
   @DataProvider(name = "Authentication")
   public static Object[] [] credentials()
   {
       return new Object[][]
               {
                       { "admin","password"},
                       {"admnins" , "password"}
               };

   }
    @Test(dataProvider = "Authentication")
    public void testMethod(String username, String password) {
        WebElement username_field = driver.findElement(By.id("username"));
        WebElement password_field = driver.findElement(By.id("password"));
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        String text =driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Welcome Back, admin");
    }
    @AfterMethod
    public void aftermethod()
    {
        driver.quit();

    }
}
