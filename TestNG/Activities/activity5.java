package Activities;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity5 {
    WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void beforemethod() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }
    @Test(groups ={"Header","Button"})
    public void testcase1() {
        driver.get(" https://www.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }
    @Test(dependsOnMethods = {"testcase1"}, groups = {"Header"})
    public void Headertestcase()
    {

        String Thirdheader = driver.findElement(By.tagName("h3")).getText();
        System.out.println(Thirdheader);
        Assert.assertEquals(Thirdheader, "Third header");
    }
    @Test(dependsOnMethods = {"testcase1"}, groups = {"Header"})
    public void Headertestcase2()
    {
        String Fifth_Header =driver.findElement(By.xpath("//h5[@class ='ui green header' ]"))
                        .getCssValue("color");
        System.out.println(Fifth_Header);
        Assert.assertEquals(Fifth_Header,"rgb(33, 186, 69)");

    }
    @Test(dependsOnMethods = {"testcase1"},groups = {"button"})
    public void Button_testcase()
    {
        String Olive_button =driver.findElement(By.xpath("//button[@class = 'ui olive button']"))
                .getText();
        Assert.assertEquals(Olive_button,"Olive");
        System.out.println(Olive_button);
    }
    @Test(dependsOnMethods = {"testcase1"},groups = {"button"})
    public void Button_testcase2()
    {
        System.out.println("Brown button testcase");
        String Brown_colr  =driver.findElement(By.xpath("//button[@class ='ui brown button' ]"))
                .getCssValue("color");
        System.out.println(Brown_colr);
        Assert.assertEquals(Brown_colr,"rgb(255, 255, 255)");
    }

    @AfterMethod(alwaysRun = true)
    public void aftermethod()
    {
        driver.quit();

    }
}
