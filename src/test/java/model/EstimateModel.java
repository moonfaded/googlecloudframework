package model;

import java.util.Objects;

public class EstimateModel {
  private String numberOfInstances;
  private String instancesAssignment;
  private String operatingSystem;
  private String virtualMachineClass;
  private String machineSeries;
  private String machineType;
  private String addGpus;
  private String numberOfGpus;
  private String gpuType;
  private String localSsd;
  private String datacenterLocation;
  private String committedUsage;
  private String estimatedCost;

  public EstimateModel(String numberOfInstances, String instancesAssignment, String operatingSystem, String virtualMachineClass, String machineSeries, String machineType, String addGpus, String numberOfGpus, String gpuType, String localSsd, String datacenterLocation, String committedUsage, String estimatedCost) {
    this.numberOfInstances = numberOfInstances;
    this.instancesAssignment = instancesAssignment;
    this.operatingSystem = operatingSystem;
    this.virtualMachineClass = virtualMachineClass;
    this.machineSeries = machineSeries;
    this.machineType = machineType;
    this.addGpus = addGpus;
    this.numberOfGpus = numberOfGpus;
    this.gpuType = gpuType;
    this.localSsd = localSsd;
    this.datacenterLocation = datacenterLocation;
    this.committedUsage = committedUsage;
    this.estimatedCost = estimatedCost;
  }

  public String getMachineSeries() {
    return machineSeries;
  }

  public void setMachineSeries(String machineSeries) {
    this.machineSeries = machineSeries;
  }

  public String getNumberOfInstances() {
    return numberOfInstances ;
  }

  public void setNumberOfInstances(String numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
  }

  public String getInstancesAssignment() {
    return instancesAssignment;
  }

  public void setInstancesAssignment(String instancesAssignment) {
    this.instancesAssignment = instancesAssignment;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public String getVirtualMachineClass() {
    return virtualMachineClass;
  }

  public void setVirtualMachineClass(String virtualMachineClass) {
    this.virtualMachineClass = virtualMachineClass;
  }

  public String getMachineType() {
    return machineType;
  }

  public void setMachineType(String machineType) {
    this.machineType = machineType;
  }

  public String getAddGpus() {
    return addGpus;
  }

  public void setAddGpus(String addGpus) {
    this.addGpus = addGpus;
  }

  public String getNumberOfGpus() {
    return numberOfGpus;
  }

  public void setNumberOfGpus(String numberOfGpus) {
    this.numberOfGpus = numberOfGpus;
  }

  public String getGpuType() {
    return gpuType;
  }

  public void setGpuType(String gpuType) {
    this.gpuType = gpuType;
  }

  public String getLocalSsd() {
    return localSsd;
  }

  public void setLocalSsd(String localSsd) {
    this.localSsd = localSsd;
  }

  public String getDatacenterLocation() {
    return datacenterLocation;
  }

  public void setDatacenterLocation(String datacenterLocation) {
    this.datacenterLocation = datacenterLocation;
  }

  public String getCommittedUsage() {
    return committedUsage;
  }

  public void setCommittedUsage(String committedUsage) {
    this.committedUsage = committedUsage;
  }

  public String getEstimatedCost() {
    return estimatedCost;
  }

  public void setEstimatedCost(String estimatedCost) {
    this.estimatedCost = estimatedCost;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EstimateModel)) return false;
    EstimateModel that = (EstimateModel) o;
    return Objects.equals(getNumberOfInstances(), that.getNumberOfInstances()) &&
               Objects.equals(getInstancesAssignment(), that.getInstancesAssignment()) &&
               Objects.equals(getOperatingSystem(), that.getOperatingSystem()) &&
               Objects.equals(getVirtualMachineClass(), that.getVirtualMachineClass()) &&
               Objects.equals(getMachineSeries(), that.getMachineSeries()) &&
               Objects.equals(getMachineType(), that.getMachineType()) &&
               Objects.equals(getAddGpus(), that.getAddGpus()) &&
               Objects.equals(getNumberOfGpus(), that.getNumberOfGpus()) &&
               Objects.equals(getGpuType(), that.getGpuType()) &&
               Objects.equals(getLocalSsd(), that.getLocalSsd()) &&
               Objects.equals(getDatacenterLocation(), that.getDatacenterLocation()) &&
               Objects.equals(getCommittedUsage(), that.getCommittedUsage()) &&
               Objects.equals(getEstimatedCost(), that.getEstimatedCost());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNumberOfInstances(), getInstancesAssignment(), getOperatingSystem(), getVirtualMachineClass(), getMachineSeries(), getMachineType(), getAddGpus(), getNumberOfGpus(), getGpuType(), getLocalSsd(), getDatacenterLocation(), getCommittedUsage(), getEstimatedCost());
  }

  @Override
  public String toString() {
    return "EstimateModel{" +
               "numberOfInstances='" + numberOfInstances + '\'' +
               ", instancesAssignment='" + instancesAssignment + '\'' +
               ", operatingSystem='" + operatingSystem + '\'' +
               ", virtualMachineClass='" + virtualMachineClass + '\'' +
               ", machineSeries='" + machineSeries + '\'' +
               ", machineType='" + machineType + '\'' +
               ", addGpus='" + addGpus + '\'' +
               ", numberOfGpus='" + numberOfGpus + '\'' +
               ", gpuType='" + gpuType + '\'' +
               ", localSsd='" + localSsd + '\'' +
               ", datacenterLocation='" + datacenterLocation + '\'' +
               ", committedUsage='" + committedUsage + '\'' +
               ", estimatedCost='" + estimatedCost + '\'' +
               '}';
  }
}
