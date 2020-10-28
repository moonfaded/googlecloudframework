package page;

import model.EstimateModel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class TenMinuteMailPage extends AbstractPage {

  private static String email;

  public static String getEmail() {
    return email;
  }

  public TenMinuteMailPage(WebDriver driver) {
    super(driver);
  }

  private static final String TEN_MINUTE_MAIL_PAGE_URL = "https://10minutemail.com";

  @FindBy(xpath = "//*[@id='cloud-site']//iframe")
  private WebElement firstFrame;

  @FindBy(xpath = "//*[@id='myFrame']")
  private WebElement secondFrame;

  @FindBy(id = "mail_address")
  private WebElement emailAddress;

  @FindBy(xpath = "//*[@id='mail_messages_content']" + "//*[contains(text(), 'Google Cloud Platform Price Estimate')]")
  private WebElement emailMessage;

  @FindBy(xpath = "//h3[contains(text(),'USD')]")
  private static WebElement totalCost;

  public TenMinuteMailPage openTenMinuteMail() {
    driver.get(TEN_MINUTE_MAIL_PAGE_URL);
    CustomConditions.clickOnVisibleElement(emailAddress, driver);
    return this;
  }

  public TenMinuteMailPage copyGeneratedTenMinuteMail() {
    new WebDriverWait(driver, 15).until(ExpectedConditions.attributeContains(emailAddress, "value", "@"));
    email = emailAddress.getAttribute("value");
    //emailAddress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
    return this;
  }

  public EstimateMailingPage switchToCalculatorTab() {
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(0));
    return new EstimateMailingPage(driver);
  }

  public TenMinuteMailPage openMessageWithEmailedEstimate() {
    CustomConditions.clickOnVisibleElement(emailMessage, driver);
    CustomConditions.clickOnVisibleElement(totalCost, driver);
    return this;
  }

  public boolean isEstimatedCostEqualTo(EstimateModel estimateModel) {
    return totalCost.getText().contains(estimateModel.getEstimatedCost());
  }

  public static String getPlatformCostFromEmail() {
    return totalCost.getText();
  }
}
