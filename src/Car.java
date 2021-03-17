import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car {
  protected double kmPrL;
  private String regNumber;
  private String brand;
  private String model;
  private int year;
  private int numbersOfDoors;

  protected static double getWeightTax(double kmPrL) {
    if (kmPrL > 20) {
      return 330;
    } else if (kmPrL > 15) {
      return 1050;
    } else if (kmPrL > 10) {
      return 2340;
    } else if (kmPrL > 5) {
      return 5500;
    } else {
      return 10470;
    }
  }

  protected abstract double calculateGreenOwnershipTax();

  protected abstract boolean hasParticleFilter();

  protected abstract double getMaxKm();

  protected abstract int getWhPrKm();

  protected abstract int getBatteryCapacityKWh();

  protected abstract int getOctane();

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setNumbersOfDoors(int numbersOfDoors) {
    this.numbersOfDoors = numbersOfDoors;
  }

  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    // common
    ArrayList<String> str =
        new ArrayList<>(
            Arrays.asList(
                "Reg number: %s".formatted(regNumber),
                "Brand: %s".formatted(brand),
                "Model: %s".formatted(model),
                "Max km: %s".formatted(getMaxKm()),
                "Year: %d".formatted(year),
                "Numbers of doors: %d".formatted(numbersOfDoors),
                "Green ownership tax: %s kr.".formatted(calculateGreenOwnershipTax())));

    // individually
    if (this instanceof DieselCar) {
      str.add("Has particle filter: %s".formatted(hasParticleFilter()));
    }

    if (this instanceof PetrolCar) {
      str.add("Octane: %d".formatted(getOctane()));
    }

    if (this instanceof ElectricCar) {
      str.addAll(
          Arrays.asList(
              "Battery capacity: %d kwh".formatted(getBatteryCapacityKWh()),
              "Max km: %s km".formatted(getMaxKm()),
              "Wh pr. km: %d".formatted(getWhPrKm())));
    }

    return String.join("\n", str);
  }
}