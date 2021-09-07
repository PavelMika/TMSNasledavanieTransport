public class Truck extends LandTransport {
    private double carryingCapacity; //(T) грузоподъемность

    public Truck(int power, int maxSpeed, boolean weight, String model, int numberOfWheels,
                 double fuelConsumption) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
