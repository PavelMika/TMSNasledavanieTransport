public class PassengerCar extends LandTransport {
    private String bodyType;
    private int numberOfPassenger;

    public PassengerCar(int power, int maxSpeed, boolean weight, String model,
                        int numberOfWheels, double fuelConsumption,
                        String bodyType, int numberOfPassenger) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
    }


}

