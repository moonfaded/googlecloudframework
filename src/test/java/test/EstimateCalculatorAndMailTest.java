package test;

import model.EstimateModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleCloudHomePage;
import page.TenMinuteMailPage;
import service.EstimateModelCreator;

public class EstimateCalculatorAndMailTest extends AbstractTest {

  @Test
  public void estimatedCostEqualsEmailedCost() {
    EstimateModel estimateModel = EstimateModelCreator.createEstimateWithDataFromProperty();

    boolean expectedValue = new GoogleCloudHomePage(driver)
                                .openPage()
                                .searchForGoogleCloudPlatformCalculator()
                                .openGoogleCloudPlatformCalculator()
                                .setPlatformProperties(estimateModel)
                                .addPlatformToEstimate()
                                .openTenMinuteMailPageInNewTab()
                                .copyGeneratedTenMinuteMail()
                                .switchToCalculatorTab()
                                .clickEmailEstimateButton()
                                .sendEstimateEmail()
                                .switchToTenMinuteMailTab()
                                .openMessageWithEmailedEstimate()
                                .isEstimatedCostEqualTo(estimateModel);

    Assert.assertTrue(expectedValue, "Total estimated monthly cost received on Pricing Calculator page is not equal to manual test result!");
  }
}
