import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ElectricCarTest {
  ElectricCar electricCar = new ElectricCar();

  @Test
  void testCalculateGreenOwnershipTax() {
    electricCar.setWhPrKm(200);
    double result = electricCar.calculateGreenOwnershipTax();
    Assertions.assertEquals(330.0, result);
  }

  @Test
  void testHasParticleFilter() {
    boolean result = electricCar.hasParticleFilter();
    Assertions.assertFalse(result);
  }

  @Test
  void testGetOctane() {
    int result = electricCar.getOctane();
    Assertions.assertEquals(0, result);
  }

  @Test
  void testToString() {
    String result = electricCar.toString();
    for (String s :
        Arrays.asList(
            "Reg number: ",
            "Brand: ",
            "Model: ",
            "Max km: ",
            "Year: ",
            "Number of doors: ",
            "Green ownership tax: ",
            "Battery capacity: ",
            "Wh pr. km: ")) {
      Assertions.assertTrue(result.contains(s));
    }
    for (String s : Arrays.asList("Octane: ", "Has particle filter: ")) {
      Assertions.assertFalse(result.contains(s));
    }
  }
}
