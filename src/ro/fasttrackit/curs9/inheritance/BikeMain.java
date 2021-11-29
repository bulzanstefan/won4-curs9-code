package ro.fasttrackit.curs9.inheritance;

public class BikeMain {
    public static void main(String[] args) {
        Bike myBike = new Bike();

        myBike.increaseSpeed(10);
        System.out.println(myBike);
        myBike.stop();
        System.out.println(myBike);
        myBike.flatTyre();
        System.out.println(myBike);
        System.out.println("----Mountain");

        MountainBike mountainBike = new MountainBike();
        System.out.println(mountainBike);
        mountainBike.increaseSpeed(10);
        System.out.println(mountainBike);
        mountainBike.flatTyre();
        System.out.println(mountainBike);
        mountainBike.resetTyrePressure();
        mountainBike.increaseSpeed(15);
        System.out.println(mountainBike);
        mountainBike.setSuspensionStrength(3);
        System.out.println(mountainBike.getSuspensionStrength());

        System.out.println("------ MountainBike is a Bike");
        Bike mountainBike2 = new MountainBike();
        mountainBike2.increaseSpeed(10);
        System.out.println(mountainBike2);
    }
}
