public class GearedBicycle extends Bicycle {

    @Override
    public void brake() {
        // slows down twice as fast as a regular bicycle
        setSpeed(getSpeed() - 2);

        if (getSpeed() < 0) {
            setSpeed(0);
        }
    }
}