package ro.fasttrackit.curs9.inheritance;

public class Bike {
    protected int tyrePressure;
    protected int speed;

    public Bike() {
        this(30);
    }

    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
        this.speed = 0;
    }

    public void increaseSpeed(int increment) {
        System.out.println("Bike implementation");
        this.speed += increment;
    }

    protected void stop() {
        this.speed = 0;
    }

    void resetTyrePressure() {
        this.tyrePressure = 30;
    }

    void flatTyre(){
        System.out.println("Bike implementation");
        this.tyrePressure = 0;
    }

    private void downhillSpeed() {
        this.speed = 60;
    }

    public String toString(){
        return "tyrePressure: " + tyrePressure + "; speed:" + speed;
    }
}
