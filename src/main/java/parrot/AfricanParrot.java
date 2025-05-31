package parrot;

public class AfricanParrot extends Parrot {
    private static final double LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        double speedReduction = calculateSpeedReduction();
        return calculateFinalSpeed(speedReduction);
    }

    private double calculateSpeedReduction() {
        return LOAD_FACTOR * numberOfCoconuts;
    }

    private double calculateFinalSpeed(double speedReduction) {
        double finalSpeed = BASE_SPEED - speedReduction;
        return Math.max(MIN_SPEED, finalSpeed);
    }

    @Override
    public String getCry() {
        return ParrotSounds.AFRICAN_CRY;
    }
}