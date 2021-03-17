import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PetrolCarTest {
  PetrolCar petrolCar = new PetrolCar();

  @Test
  void testCalculateGreenOwnershipTax() {
    petrolCar.setKmPrL(14);
    double result = petrolCar.calculateGreenOwnershipTax();
    Assertions.assertEquals(2340.0, result);
  }

  @Test
  void testHasParticleFilter() {
    boolean result = petrolCar.hasParticleFilter();
    Assertions.assertFalse(result);
  }

  @Test
  void testGetMaxKm() {
    double result = petrolCar.getMaxKm();
    Assertions.assertEquals(0d, result);
  }

  @Test
  void testGetWhPrKm() {
    int result = petrolCar.getWhPrKm();
    Assertions.assertEquals(0, result);
  }

  @Test
  void testGetBatteryCapacityKWh() {
    int result = petrolCar.getBatteryCapacityKWh();
    Assertions.assertEquals(0, result);
  }

  @Test
  void testToString() {
    String result = petrolCar.toString();
    for (String s :
        Arrays.asList(
            "Reg number: ",
            "Brand: ",
            "Model: ",
            "Year: ",
            "Number of doors: ",
            "Green ownership tax: ",
            "Octane: ")) {
      Assertions.assertTrue(result.contains(s));
    }
    for (String s : Arrays.asList("Battery capacity: ", "Wh pr. km: ", "Has particle filter: ")) {
      Assertions.assertFalse(result.contains(s));
    }
  }
}
