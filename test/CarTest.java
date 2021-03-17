import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {
  @Test
  void testGetWeightTax() {
    double result = Car.getWeightTax(10);
    Assertions.assertEquals(5500.0, result);
  }

  @Test
  void testToString() {
    // Already tested in the subclasses.
  }
}
