package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class activity18 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        System.out.println("Home page title: " + driver.getTitle());
        WebElement multiselect =driver.findElement(By.id("multi-select"));
        Select selects = new Select(multiselect);
        selects.selectByVisibleText("Javascript");
        System.out.println("First selected option :" +selects.getFirstSelectedOption().getText());
        for(int i=4; i<=6; i++) {
            selects.selectByIndex(i);
        }
        List<WebElement> Options = selects.getAllSelectedOptions();
        System.out.println(" Print Selected options  ");
        for(WebElement option : Options) {
            System.out.println(option.getText());
        }

      selects.deselectByIndex(5);

        Options = selects.getAllSelectedOptions();
        System.out.println("Selected options are after deleted HTML: ");
        for(WebElement option : Options) {
            System.out.println(option.getText());
        }


        driver.quit();
    }}