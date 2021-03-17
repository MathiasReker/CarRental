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
    dieselCar.kmPrL = 23;
    dieselCar.setParticleFilter(false);
    double result = dieselCar.calculateGreenOwnershipTax();
    Assertions.assertEquals(1460.0, result);
  }

  @Test
  void testToString() {
    String result = dieselCar.toString();
    Assertions.assertTrue(result.contains("Reg number: "));
    for (String s :
        Arrays.asList(
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
