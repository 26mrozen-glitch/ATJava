public class BicycleDemo {
    public static void main(String[] args) {

        Bicycle regularBike = new Bicycle();
        GearedBicycle gearedBike = new GearedBicycle();

        // Pedal both bikes up to speed
        for (int i = 0; i < 5; i++) {
            regularBike.pedal();
            gearedBike.pedal();
        }

        System.out.println("Initial Speeds:");
        System.out.println("Regular Bike: " + regularBike.getSpeed());
        System.out.println("Geared Bike: " + gearedBike.getSpeed());

        // Apply brakes once
        regularBike.brake();
        gearedBike.brake();

        System.out.println("\nAfter Braking:");
        System.out.println("Regular Bike: " + regularBike.getSpeed());
        System.out.println("Geared Bike: " + gearedBike.getSpeed());
    }
}