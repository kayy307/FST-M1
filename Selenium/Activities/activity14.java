package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class activity14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());
        List<WebElement> rows  = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));

        System.out.println("No.Of.rows : " +rows.size());
        List<WebElement> column  = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));

        System.out.println("No.Of.rows : " +column.size());
        WebElement row2_colm2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));

        System.out.println("Second row details : " +row2_colm2.getText());
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
        row2_colm2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));

        System.out.println("Second row details : " +row2_colm2.getText());

        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        for (WebElement y : footer )
        {
            System.out.println(y.getText());
        }

       driver.quit();
}}
