public class DieselCar extends Car {
  private boolean hasParticleFilter;

  public void setKmPrL(double kmPrL) {
    this.kmPrL = kmPrL;
  }

  public void setParticleFilter(boolean hasParticleFilter) {
    this.hasParticleFilter = hasParticleFilter;
  }

  @Override
  protected boolean hasParticleFilter() {
    return hasParticleFilter;
  }

  @Override
  protected double getMaxKm() {
    return 0;
  }

  @Override
  protected int getWhPrKm() {
    return 0;
  }

  @Override
  protected int getBatteryCapacityKWh() {
    return 0;
  }

  @Override
  protected int getOctane() {
    return 0;
  }

  @Override
  protected double calculateGreenOwnershipTax() {
    return getWeightTax(kmPrL) + calcDieselTax(kmPrL) + (!hasParticleFilter ? 1000 : 0);
  }

  private double calcDieselTax(double kmPrL) {
    if (kmPrL > 20) {
      return 130;
    } else if (kmPrL > 15) {
      return 1390;
    } else if (kmPrL > 10) {
      return 1850;
    } else if (kmPrL > 5) {
      return 2770;
    } else {
      return 15260;
    }
  }
}
