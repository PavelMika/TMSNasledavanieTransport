public class LandTransport extends Transport{
    private int numberOfWheels;
    private double fuelConsumption;//(л/100км)

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public LandTransport(int power, int maxSpeed, boolean weight, String model, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

}
