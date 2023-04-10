package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page" +driver.getTitle());
        Actions cube = new Actions(driver);

        cube.click().pause(2000).build().perform();
        String Left_click = driver.findElement(By.className("active")).getText();
        System.out.println(Left_click);

        cube.doubleClick().pause(1000).build().perform();
        String double_click = driver.findElement(By.className("active")).getText();
        System.out.println(double_click);

        cube.contextClick().pause(1500).build().perform();
        String front_cube = driver.findElement(By.className("active")).getText();
        System.out.println(front_cube);
        driver.quit();



    }}
