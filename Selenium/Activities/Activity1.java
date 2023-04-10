package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net");
        String Title = driver.getTitle();
        System.out.println("Title of the website="+Title );
        driver.findElement(By.id("about-link")).click();
        String newtitle = driver.getTitle();
        System.out.println("Tite of the next page" +newtitle);
        driver.quit();


    }

    }

