import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Car> garage = new ArrayList<>();

    DieselCar car1 = new DieselCar();
    car1.setBrand("BMW");
    car1.setModel("118d");
    car1.setNumbersOfDoors(3);
    car1.setYear(2008);
    car1.setRegNumber("AS50603");
    car1.setKmPrL(23);
    car1.setParticleFilter(true);

    PetrolCar car2 = new PetrolCar();
    car2.setBrand("BMW");
    car2.setModel("120i");
    car2.setNumbersOfDoors(3);
    car2.setYear(2010);
    car2.setRegNumber("SB33203");
    car2.setKmPrL(16);
    car2.setOctane(95);

    ElectricCar car3 = new ElectricCar();
    car3.setBrand("Tesla");
    car3.setModel("X");
    car3.setNumbersOfDoors(5);
    car3.setYear(2019);
    car3.setRegNumber("QW125555");
    car3.setMaxKm(600);
    car3.setBatteryCapacityKWh(2000);
    car3.setWhPrKm(200);

    garage.add(car1);
    garage.add(car2);
    garage.add(car3);

    for (Car car : garage) {
      System.out.println(car + "\n");
    }
  }
}
