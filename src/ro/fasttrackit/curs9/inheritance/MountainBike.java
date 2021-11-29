package ro.fasttrackit.curs9.inheritance;

public class MountainBike extends Bike {
    private static final int MY_CONSTANT = 3;

    private int suspensionStrength;

    public MountainBike() {
        super();
        this.suspensionStrength = 5;
    }

    public MountainBike(int tyrePressure, int suspensionStrength) {
        super(tyrePressure);
        this.suspensionStrength = suspensionStrength;
    }

    public void increaseSpeed() {
        increaseSpeed(10);
    }

    @Override
    public void increaseSpeed(final int increment) {
        increaseSpeed(increment, 1);
    }

    public void increaseSpeed(int increment, int tyrePressureIncrement) {
        increaseSpeed(increment, tyrePressureIncrement, 3);
    }

    public void increaseSpeed(int increment, int tyrePressureIncrement, int speedDecrease) {
        System.out.println("Mountain Bike implementation");
        this.speed += increment - speedDecrease;
        this.tyrePressure -= tyrePressureIncrement;
    }

    @Override
    void flatTyre() {
        super.flatTyre();
        System.out.println("MountainBike implementation");
        stop();
    }

    public int getSuspensionStrength() {
        return suspensionStrength;
    }

    public void setSuspensionStrength(int strength) {
        if (strength > 0 && strength < 10) {
            this.suspensionStrength = strength;
        }
    }
}
