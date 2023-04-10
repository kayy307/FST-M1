package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class activity7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/drag-drop");
        System.out.println("Title: " + driver.getTitle());
        Actions dragdrop = new Actions(driver);
        Thread.sleep(1000);


        dragdrop.clickAndHold(driver.findElement(By.id("draggable")))
                .moveToElement(driver.findElement(By.id("droppable")))
                .pause(2000).release().build().perform();

       String ball = driver.findElement(By.tagName("p")).getText();
       System.out.println(ball +"in dropzone1");
       Thread.sleep(2000);

       dragdrop.dragAndDrop(driver.findElement(By.id("droppable")), driver.findElement(By.id("dropzone2")))
               .build().perform();

        String balls = driver.findElement(By.tagName("p")).getText();
        System.out.println(balls +"in dropzone2");
        driver.quit();




    }
}