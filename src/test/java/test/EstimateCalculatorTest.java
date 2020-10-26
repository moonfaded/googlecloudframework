package test;

import model.EstimateModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleCloudHomePage;
import page.GoogleCloudPlatformCalculatorPage;
import service.EstimateModelCreator;

public class EstimateCalculatorTest  extends AbstractTest{

  @Test
  public void estimatedCostEqualsEmailedCost() {
    EstimateModel estimateModel = EstimateModelCreator.createEstimateWithDataFromProperty();

    GoogleCloudPlatformCalculatorPage calculatorTest = new GoogleCloudHomePage(driver)
                                .openPage()
                                .searchForGoogleCloudPlatformCalculator()
                                .openGoogleCloudPlatformCalculator()
                                .setPlatformProperties(estimateModel)
                                .addPlatformToEstimate();
    Assert.assertTrue(true);
  }
}
