package basic.solutions.codelab04;

public class RaceCar {

    public static final int DEFAULT_NUMBER_OF_GEARS = 6;
    public static final int DEFAULT_CURRENT_GEAR = 0;
    private int numberOfGears;
    private int currentGear;

    public RaceCar() {
        this.numberOfGears = DEFAULT_NUMBER_OF_GEARS;
        this.currentGear = DEFAULT_CURRENT_GEAR;
    }

    public RaceCar(int numberOfGears, int currentGear) {
        this.numberOfGears = numberOfGears;
        this.currentGear = validateNewGear(currentGear);
    }


    public void shiftGearDown() {
        this.currentGear = validateNewGear(currentGear - 1);
    }

    public void shiftGearUp() {
        this.currentGear = validateNewGear(currentGear + 1);
    }

    private int validateNewGear(int currentGear) {
        if (currentGear < DEFAULT_CURRENT_GEAR) {
            return DEFAULT_CURRENT_GEAR;
        }
        if (currentGear > numberOfGears) {
            return numberOfGears;
        }
        return currentGear;
    }

    @Override
    public String toString() {
        return "Racecar with " + numberOfGears + " in total, currently in " + currentGear + " gear.";
    }
}
