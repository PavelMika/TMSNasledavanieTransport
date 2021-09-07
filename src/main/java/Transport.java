public class Transport {
    private int power; //(в лошадиных силах)
    private int maxSpeed; //(км/ч)
    private boolean weight; //(кг)
    private String model;

    public Transport(int power, int maxSpeed, boolean weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }
}
