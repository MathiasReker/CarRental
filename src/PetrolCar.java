public class PetrolCar extends Car {
  private int octane;

  public void setKmPrL(double kmPrL) {
    this.kmPrL = kmPrL;
  }

  protected int getOctane() {
    return octane;
  }

  public void setOctane(int octane) {
    this.octane = octane;
  }

  public double calculateGreenOwnershipTax() {
    return getWeightTax(kmPrL);
  }

  @Override
  public boolean hasParticleFilter() {
    return false;
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
}
