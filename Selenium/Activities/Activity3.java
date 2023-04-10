package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
       driver.get("https://training-support.net");
        System.out.println("Title of the website="+driver.getTitle() );
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        String newtitle = driver.getTitle();
        System.out.println("Tite of the next page" +newtitle);
        driver.quit();
        driver.get("https://www.training-support.net/selenium/login-form");
        System.out.println("Title of the page - " +driver.getTitle());
        driver.findElement(By.xpath("//input[@name = 'Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String Confirmation =driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("User logged in sucessfully  " + Confirmation);
        driver.quit();


    }
}
