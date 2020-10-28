package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomConditions {

  public static void switchToInnerFrame(WebElement firstFrame, WebElement secondFrame, WebDriver driver) {
    switchToAvailableFrame(firstFrame, driver);
    switchToAvailableFrame(secondFrame, driver);
  }

  private static void switchToAvailableFrame(WebElement frame, WebDriver driver) {
    new WebDriverWait(driver, 15)
        .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
  }

  public static void clickOnVisibleElement(WebElement element, WebDriver driver) {
    new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(element));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
  }

  public static void clickOnVisibleElement(By requiredOptionLocator, WebDriver driver) {
    WebElement requiredOption = new WebDriverWait(driver, 15)
                                    .until(ExpectedConditions.visibilityOfElementLocated(requiredOptionLocator));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", requiredOption);
  }

  public static void clickOnClickableElement(WebElement webElement, WebDriver driver) {
    new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(webElement));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
  }

  public static void selectFromTheDropdownList(WebElement dropdownList, String requiredOptionXpath,
      String requiredOption, WebDriver driver) {
    clickOnVisibleElement(dropdownList, driver);
    By requiredOptionLocator = By.xpath(String.format(requiredOptionXpath, requiredOption));
    clickOnVisibleElement(requiredOptionLocator, driver);
  }
}
