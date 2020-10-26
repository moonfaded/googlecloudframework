package test;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import util.TestListener;

@Listeners({TestListener.class})

public class AbstractTest {

  protected WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void browserSetup() {
    driver = DriverSingleton.getDriver();
  }

  @AfterMethod(alwaysRun = true)
  public void browserTearDown() {
   DriverSingleton.closeDriver();
  }
}
