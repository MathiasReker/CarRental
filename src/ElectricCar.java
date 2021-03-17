public class ElectricCar extends Car {
  protected int batteryCapacityKWh;
  protected double maxKm;
  protected int whPrKm;

  protected double getMaxKm() {
    return maxKm;
  }

  public void setMaxKm(double maxKm) {
    this.maxKm = maxKm;
  }

  protected int getBatteryCapacityKWh() {
    return batteryCapacityKWh;
  }

  public void setBatteryCapacityKWh(int batteryCapacityKWh) {
    this.batteryCapacityKWh = batteryCapacityKWh;
  }

  protected int getWhPrKm() {
    return whPrKm;
  }

  public void setWhPrKm(int whPrKm) {
    this.whPrKm = whPrKm;
  }

  @Override
  public double calculateGreenOwnershipTax() {
    double i = 100 / (getWhPrKm() / 91.25);
    return getWeightTax(i);
  }

  @Override
  public boolean hasParticleFilter() {
    return false;
  }

  @Override
  protected int getOctane() {
    return 0;
  }
}
