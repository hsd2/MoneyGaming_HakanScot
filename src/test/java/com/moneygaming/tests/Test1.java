package com.moneygaming.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test1 {

    // we made our driver object Global Variable
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
// opens me a chrome driver
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
// get the page
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
    }

    @Test
    public void test1() throws InterruptedException {

        WebElement nameBox= driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Mike");
        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Smith");
        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }
}
