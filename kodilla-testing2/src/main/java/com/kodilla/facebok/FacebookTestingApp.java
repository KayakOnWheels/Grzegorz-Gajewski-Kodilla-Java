package com.kodilla.facebok;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {

    public static final String XPATHLOGIN = "//a[@class='sc-fYXIxC iaxnEd nav-link' and @role='button']";
    public static final String XPATHNEWACCOUNT = "//a[contains(@class, 'sc-bSoiow dQLCzj') and contains(., 'Nie masz konta?')]";
    public static final String XPATHEMAIL = "//input[contains(@class, 'sc-bZjLpj eXSJLt') and @name='email']";
    public static final String XPATHPASSWORD = "//input[contains(@class, 'sc-bZjLpj eXSJLt') and @name='password']";
    public static final String XPATHREPEATPASSWORD = "//input[contains(@class, 'sc-bZjLpj eXSJLt') and @name='password_confirmation']";
    public static final String XPATHACCEPTTERMS = "//input[contains(@class, 'sc-gmLERg jSQMlu') and @type='checkbox' and @name='terms']";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX).get();
        driver.get("https://www.kodilla.com/pl");

        while (!driver.findElement(By.xpath(XPATHLOGIN)).isDisplayed());
        driver.findElement(By.xpath(XPATHLOGIN)).click();

        driver.findElement(By.xpath(XPATHNEWACCOUNT)).click();

        driver.findElement(By.xpath(XPATHEMAIL)).sendKeys("mail@mail.com");
        driver.findElement(By.xpath(XPATHPASSWORD)).sendKeys("pass123");
        driver.findElement(By.xpath(XPATHREPEATPASSWORD)).sendKeys("pass123");

        driver.findElement(By.xpath(XPATHACCEPTTERMS)).click();



    }
}
