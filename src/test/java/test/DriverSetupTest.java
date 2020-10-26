package test;

import org.testng.annotations.Test;

public class DriverSetupTest extends AbstractTest{

  @Test
  private void driverSetupTest() {
    driver.get("https://google.com/");
  }
}
