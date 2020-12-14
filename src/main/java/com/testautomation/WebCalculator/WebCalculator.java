package com.testautomation.WebCalculator;

import com.testautomation.CalculatorInterface.CalculatorInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebCalculator implements CalculatorInterface {

    private WebDriver driver;
    private WebDriverWait wait;
    private By textFieldLocator = By.cssSelector("input[type='text']");
    private By resultLocator = By.cssSelector("result[title='Click to expand/collapse row 1']");

    public WebCalculator(WebDriver driver) {
        this.driver = driver;
    }

    public String expectedResult() {
        return driver.findElement(resultLocator).getText();
    }

    @Override
    public double combine(double x, double y) {
        wait = new WebDriverWait(driver, 5);
        WebElement textField = wait.until(ExpectedConditions.visibilityOfElementLocated(textFieldLocator));
        textField.sendKeys(String.valueOf(x), "+", String.valueOf(y));
        return Double.valueOf(expectedResult());
    }

    @Override
    public double deduct(double x, double y) {
        wait = new WebDriverWait(driver, 5);
        WebElement textField = wait.until(ExpectedConditions.visibilityOfElementLocated(textFieldLocator));
        textField.sendKeys(String.valueOf(x), "-", String.valueOf(y));
        return Double.valueOf(expectedResult());
    }

    @Override
    public double multiply(double x, double y) {
        wait = new WebDriverWait(driver, 5);
        WebElement textField = wait.until(ExpectedConditions.visibilityOfElementLocated(textFieldLocator));
        textField.sendKeys(String.valueOf(x), "*", String.valueOf(y));
        return Double.valueOf(expectedResult());
    }

    @Override
    public double divide(double x, double y) {
        wait = new WebDriverWait(driver, 5);
        WebElement textField = wait.until(ExpectedConditions.visibilityOfElementLocated(textFieldLocator));
        textField.sendKeys(String.valueOf(x), "/", String.valueOf(y));
        return Double.valueOf(expectedResult());
    }
}
