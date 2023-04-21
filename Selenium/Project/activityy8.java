package Activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class activityy8 {

    public static void main(String args[]) throws InterruptedException {

         System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://alchemy.hguy.co/crm/");
            driver.findElement(By.name("user_name")).sendKeys("admin");
            driver.findElement(By.name("username_password")).sendKeys("pa$$w0rd");
            driver.findElement(By.id("bigbutton")).click();
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        Thread.sleep(1000);
      /*  List <WebElement>rows= driver.findElements(By.xpath("//td[@type='name']"));
        for(WebElement rows_names:rows)
        {
            System.out.println(rows_names.getText());
        }*/
        List <WebElement> row1= driver.findElements(By.xpath("//tr[@class='oddListRowS1']//td[@type='name']"));
        Thread.sleep(1000);
        for(int i=0;i<5;i++)
        {

            WebElement row_oddname = row1.get(i);
            System.out.println(row_oddname.getText());
        }




      /* for(WebElement row1_name :row1) {
           System.out.println(row1_name.getText());
       }*/

    }



    }


