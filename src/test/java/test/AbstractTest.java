package test;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AbstractTest {

  protected WebDriver driver;

  @BeforeMethod (alwaysRun = true)
  public void browserSetup() {
    driver = DriverSingleton.getDriver();
  }

  @AfterTest(alwaysRun = true)
  public void browserTearDown() {
    DriverSingleton.closeDriver();
  }
}
