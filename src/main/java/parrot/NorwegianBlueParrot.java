package parrot;

public class NorwegianBlueParrot extends Parrot {
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        if (isNailed) {
            return MIN_SPEED;
        }
        return calculateVoltageAdjustedSpeed();
    }

    private double calculateVoltageAdjustedSpeed() {
        if (!isEnergized()) {
            return MIN_SPEED;
        }
        return calculateSpeedWithVoltage();
    }

    private double calculateSpeedWithVoltage() {
        double voltageAdjustedSpeed = voltage * BASE_SPEED;
        return Math.min(MAX_SPEED, voltageAdjustedSpeed);
    }

    @Override
    public String getCry() {
        return isEnergized() ? ParrotSounds.NORWEGIAN_ENERGIZED_CRY : ParrotSounds.NORWEGIAN_DEENERGIZED_CRY;
    }

    private boolean isEnergized() {
        return voltage > MIN_SPEED;
    }
}