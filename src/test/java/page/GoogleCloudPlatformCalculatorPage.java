package page;

import model.EstimateModel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class GoogleCloudPlatformCalculatorPage extends AbstractPage {

  public GoogleCloudPlatformCalculatorPage(WebDriver driver) {
    super(driver);
  }

  private final String MD_OPTION_XPATH = "//md-option//div[contains(text(), '%s')]";
  private final String MD_SELECT_MENU_CONTAINER_XPATH = "//div[@class='md-select-menu-container md-active md-clickable']//div[contains(text(), '%s')]";

  @FindBy(xpath = "//*[@id='cloud-site']//iframe")
  private WebElement firstFrame;

  @FindBy(xpath = "//*[@id='myFrame']")
  private WebElement secondFrame;

  @FindBy(xpath = "//md-tab-item//div[text()='Compute Engine']")
  private WebElement computeEngineIcon;

  @FindBy(id = "input_61")
  private WebElement numberOfInstancesInput;

  @FindBy(id = "select_value_label_54")
  private WebElement operatingSystemField;

  @FindBy(id = "select_option_63")
  private WebElement freeOperatingSystemOrSoftwareOption;

  @FindBy(id = "select_value_label_55")
  private WebElement machineClassField;

  @FindBy(id = "select_option_76")
  private WebElement machineClassRegularOption;

  @FindBy(id = "select_value_label_57")
  private WebElement seriesField;

  @FindBy(id = "select_option_186")
  private WebElement SeriesOption;

  @FindBy(id = "select_value_label_58")
  private WebElement machineTypeField;

  @FindBy(id = "select_option_358")
  private WebElement machineTypeOption;

  @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
  private WebElement addGpusCheckbox;

  @FindBy(id = "select_value_label_390")
  private WebElement numberOfGpusField;

  @FindBy(id = "select_option_397")
  private WebElement numberOfGpusSingleGpuOption;

  @FindBy(id = "select_value_label_391")
  private WebElement gpuTypeField;

  @FindBy(id = "select_option_404")
  private WebElement requiredGpuType;

  @FindBy(id = "select_value_label_352")
  private WebElement localSsdField;

  @FindBy(id = "select_option_379")
  private WebElement requiredLocalSsd;

  @FindBy(id = "select_value_label_59")
  private WebElement datacenterLocationField;

  @FindBy(id = "select_option_203")
  private WebElement requiredDatacenterLocation;

  @FindBy(id = "select_value_label_60")
  private WebElement committedUsageField;

  @FindBy(id = "select_option_94")
  private WebElement committedUsageOneYearOption;

  @FindBy(xpath = "//form[@name='ComputeEngineForm']//button[contains(text(),'Add to Estimate')]")
  private WebElement addToEstimateButton;

  public GoogleCloudPlatformCalculatorPage setPlatformProperties(EstimateModel estimateModel) {
    CustomConditions.switchToInnerFrame(firstFrame, secondFrame, driver);
    chooseTheComputeEngineSection()
        .specifyNumberOfInstances(estimateModel.getNumberOfInstances())
        .selectOperatingSystem(estimateModel.getOperatingSystem())
        .selectVirtualMachineClass(estimateModel.getVirtualMachineClass())
        .selectMachineSeries(estimateModel.getMachineSeries())
        .selectMachineType(estimateModel.getMachineType())
        .addGpus(estimateModel.getAddGpus(), estimateModel.getNumberOfGpus(), estimateModel.getGpuType())
        .selectLocalSsd(estimateModel.getLocalSsd())
        .selectDatacenterLocation(estimateModel.getDatacenterLocation())
        .selectCommittedUsage(estimateModel.getCommittedUsage());
    return this;
  }

  public GoogleCloudPlatformCalculatorPage chooseTheComputeEngineSection() {
    CustomConditions.clickOnVisibleElement(computeEngineIcon, driver);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage specifyNumberOfInstances(String numberOfInstances) {
    numberOfInstancesInput.click();
    numberOfInstancesInput.sendKeys(numberOfInstances);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage selectOperatingSystem(String requiredOperatingSystem) {
    CustomConditions.selectFromTheDropdownList(operatingSystemField, MD_OPTION_XPATH,
        requiredOperatingSystem, driver);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage selectVirtualMachineClass(String requiredVirtualMachineClass) {
    CustomConditions.selectFromTheDropdownList(machineClassField, MD_SELECT_MENU_CONTAINER_XPATH,
        requiredVirtualMachineClass, driver);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage selectMachineSeries(String requiredMachineSeries) {
    CustomConditions.selectFromTheDropdownList(seriesField, MD_SELECT_MENU_CONTAINER_XPATH,
        requiredMachineSeries, driver);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage selectMachineType(String requiredMachineType) {
    CustomConditions.selectFromTheDropdownList(machineTypeField, MD_OPTION_XPATH,
        requiredMachineType, driver);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage addGpus(String valueOfAddGPUsCheckbox, String requiredNumberOfGPUs,
      String requiredGpuType) {
    if (valueOfAddGPUsCheckbox.equals("true")) {
      CustomConditions.clickOnVisibleElement(addGpusCheckbox, driver);
      CustomConditions.selectFromTheDropdownList(numberOfGpusField, MD_SELECT_MENU_CONTAINER_XPATH,
          requiredNumberOfGPUs, driver);
      CustomConditions.selectFromTheDropdownList(gpuTypeField, MD_OPTION_XPATH,
          requiredGpuType, driver);
    }
    return this;
  }

  public GoogleCloudPlatformCalculatorPage selectLocalSsd(String requiredLocalSsd) {
    CustomConditions.selectFromTheDropdownList(localSsdField, MD_OPTION_XPATH,
        requiredLocalSsd, driver);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage selectDatacenterLocation(String requiredDatacenterLocation) {
    CustomConditions.selectFromTheDropdownList(datacenterLocationField, MD_SELECT_MENU_CONTAINER_XPATH,
        requiredDatacenterLocation, driver);
    return this;
  }

  public GoogleCloudPlatformCalculatorPage selectCommittedUsage(String requiredCommittedUsage) {
    CustomConditions.selectFromTheDropdownList(committedUsageField, MD_SELECT_MENU_CONTAINER_XPATH,
        requiredCommittedUsage, driver);
    return this;
  }
  public GoogleCloudPlatformCalculatorPage addPlatformToEstimate() {
    CustomConditions.clickOnVisibleElement(addToEstimateButton, driver);
    return this;
  }

  public TenMinuteMailPage openTenMinuteMailPageInNewTab() {
    ((JavascriptExecutor) driver).executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    return new TenMinuteMailPage(driver).openTenMinuteMail();
  }
}
