package SimpleCar;

public class SimpleCar {
  // Description of the car
  private String carDescription;

  // Number of gallons currently in tank
  private double gasTank;

  // Full capacity of gas tank and miles-per-gallon (MPG)
  private final double FULL_TANK = 10.0;
  private final double MPG = 35.0;

  // total miles driven
  private double totalMiles;

  // Constructor assigns initial values to instance variables
  public SimpleCar(String carType) {
    carDescription = carType;
    gasTank = FULL_TANK;
    totalMiles = 0.0;
  }

  // Attempt to drive the requested miles
  public String drive(double tripDistance) {

    // Calculate amount of gas needed for this trip
    double gasNeeded = tripDistance / MPG;

    // Check if owner tries to drive negative miles
    if (tripDistance <= 0.0) {
      return "Error: Miles must be greater than zero.";
    }
    // Check gas tank
    else if (gasTank <= 0.0) {
      return "Warning: The " + carDescription + " has no gas!";
    }
    // Car has enough gas for this trip
    if (gasNeeded <= gasTank) {
      totalMiles = totalMiles + tripDistance;
      gasTank -= gasNeeded;
      return "The " + carDescription + " drove " + tripDistance + " miles.";
    }
    // Drive as far as possible before running out of gas
    double actualDistance = gasTank * MPG;
    totalMiles = totalMiles + actualDistance;
    gasTank = 0;
    return "The " + carDescription + " drove " + actualDistance + " miles before running out of gas.";
  }

  // Attempt to add provided gallons of gas
  public String addGas(double gallonsToAdd) {

    // Check if owner tries to add negative gallons
    if (gallonsToAdd <= 0.0) {
      return "Error: Gallons must be greater than zero.";
    }
    // Add gas to the tank
    else {
      gasTank = gasTank + gallonsToAdd;

      // Check if too much gas was added
      if (gasTank > FULL_TANK) {
        gasTank = FULL_TANK;
        return "Warning: Gas overflowed from the tank.";
      }
    }
    return gallonsToAdd + " gallons added to the gas tank of the " + carDescription + ".";
  }

  // Return amount of gas in tank
  public double checkGasGauge() {
    return gasTank;
  }

  // Return total number of miles driven
  public double checkOdometer() {
    return totalMiles;
  }

  // Honk car horn
  public String honkHorn() {
    return "The " + carDescription + " says beep beep!";
  }

  // main() uses an object of type SimpleCar
  public static void main(String[] args) {
    SimpleCar hondaCivic = new SimpleCar("blue Honda Civic");
    SimpleCar chevyTahoe = new SimpleCar("black Chevy Tahoe");
    System.out.println(hondaCivic.drive(40.0));
    System.out.println(hondaCivic.drive(100.0));
    System.out.println(chevyTahoe.drive(280.0));
    System.out.println(chevyTahoe.drive(-100.0));
    System.out.println(chevyTahoe.drive(100.0));
    System.out.println(chevyTahoe.drive(100.0));
    System.out.println(chevyTahoe.addGas(-3.0));
    System.out.println(chevyTahoe.addGas(6.0));
    System.out.println(chevyTahoe.addGas(20.0));
  }
}