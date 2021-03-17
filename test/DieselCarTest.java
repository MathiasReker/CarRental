import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DieselCarTest {
  DieselCar dieselCar = new DieselCar();

  @Test
  void testHasParticleFilter() {
    dieselCar.setParticleFilter(true);
    boolean result = dieselCar.hasParticleFilter();
    Assertions.assertTrue(result);
  }

  @Test
  void testGetWhPrKm() {
    int result = dieselCar.getWhPrKm();
    Assertions.assertEquals(0, result);
  }

  @Test
  void testGetBatteryCapacityKWh() {
    int result = dieselCar.getBatteryCapacityKWh();
    Assertions.assertEquals(0, result);
  }

  @Test
  void testGetOctane() {
    int result = dieselCar.getOctane();
    Assertions.assertEquals(0, result);
  }

  @Test
  void testCalculateGreenOwnershipTax() {
    double result;

    dieselCar.kmPrL = 0;
    dieselCar.setParticleFilter(true);
    result = dieselCar.calculateGreenOwnershipTax();
    Assertions.assertEquals(25730.0, result);

    dieselCar.kmPrL = 10;
    dieselCar.setParticleFilter(false);
    result = dieselCar.calculateGreenOwnershipTax();
    Assertions.assertEquals(9270.0, result);

    dieselCar.kmPrL = 50;
    dieselCar.setParticleFilter(true);
    result = dieselCar.calculateGreenOwnershipTax();
    Assertions.assertEquals(460.0, result);
  }

  @Test
  void testToString() {
    String result = dieselCar.toString();

    for (String s :
        Arrays.asList(
            "Reg number: ",
            "Brand: ",
            "Model: ",
            "Year: ",
            "Number of doors: ",
            "Green ownership tax: ",
            "Has particle filter: ")) {
      Assertions.assertTrue(result.contains(s));
    }

    for (String s : Arrays.asList("Octane: ", "Battery capacity: ", "Wh pr. km: ")) {
      Assertions.assertFalse(result.contains(s));
    }
  }
}
