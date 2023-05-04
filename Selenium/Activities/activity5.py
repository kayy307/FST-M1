
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
service = FirefoxService(GeckoDriverManager().install())



with webdriver.Firefox(service=service) as driver:

    actions = ActionChains(driver)


    driver.get("https://www.training-support.net/selenium/input-events")


    print("Page title is: ", driver.title)


    actions.click().perform()

    active_side = driver.find_element(By.CLASS_NAME, "active")

    print("left click: ", active_side.text)


    actions.double_click().perform()

    active_side = driver.find_element(By.CLASS_NAME, "active")

    print("double click: ", active_side.text)


    actions.context_click().perform()

    active_side = driver.find_element(By.CLASS_NAME, "active")
    print(" right click: ", active_side.text)