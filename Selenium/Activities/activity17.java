package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class activity17 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/selects");
        Thread.sleep(5000);
        System.out.println("Title: " + driver.getTitle());
        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        System.out.println("first selected " + select.getFirstSelectedOption().getText());
        select.selectByIndex(3);
        System.out.println("Second selected " + select.getFirstSelectedOption().getText());
        select.selectByValue("4");
        System.out.println("Third selected " + select.getFirstSelectedOption().getText());
        List<WebElement> options = select.getOptions();

        for (WebElement X : options)
        {
            System.out.println("print" +X.getText());
        }
        driver.quit();


}

}

