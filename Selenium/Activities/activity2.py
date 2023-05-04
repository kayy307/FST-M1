# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    driver.get("https://www.training-support.net/selenium/login-form")
    print("Title of the page " ,driver.title)
    driver.find_element(By.ID, "username").send_keys("admin")
    driver.find_element(By.ID,"password").send_keys("password")
    driver.find_element(By.XPATH, "//button[text()='Log in']").click()
    Confirmation_message = driver.find_element(By.ID,"action-confirmation")
    print ("You logged in successfully   ", Confirmation_message.text)


    driver.close()