package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of the page = " +driver.getTitle());
        String text = driver.findElement(By.xpath("//h3[@id= 'third-header']")).getText();
        System.out.println("Tile of the 3rd hearder : " +text);
        String header2 = driver.findElement(By.xpath("//h5[@class= 'ui green header']")).getCssValue("color");
        System.out.println("Tile of the 5rd header : " +header2);
        String voilet = driver.findElement(By.xpath("//button[text() = 'Violet']")).getAttribute("class");
        System.out.println(voilet);
        String greyclor = driver.findElement(By.xpath("//button[contains(@class ,'ui grey button')]")).getText();
        System.out.println(greyclor);
        driver.quit();
    }
}