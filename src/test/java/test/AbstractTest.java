package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AbstractTest {

  protected WebDriver driver;

  @BeforeMethod (alwaysRun = true)
  public void browserSetup() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterTest(alwaysRun = true)
  public void browserTearDown() {
    driver.quit();
    driver = null;
  }
}
