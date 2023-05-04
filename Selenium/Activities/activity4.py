from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    driver.get("https://www.training-support.net/selenium/target-practice")
    print("Title of the page = " ,driver.Title())
    text = driver.find_element(By.XPATH("//h3[@id= 'third-header']")).text
    print("Tile of the 3rd header : ",text)
    header2 = driver.find_element(By.xpath("//h5[@class= 'ui green header']")).value_of_css_property("color")
    print("Tile of the 5rd header : ",header2)
    voilet = driver.find_element(By.xpath("//button[text() = 'Violet']")).get_attribute("classr")
    print(voilet);
    greyclor = driver.findElement(By.xpath("//button[contains(@class ,'ui grey button')]")).getText();
    print(greyclor)
    driver.quit()











S