package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> calculateEuropeanParrotSpeed();
            case AFRICAN -> calculateAfricanParrotSpeed();
            case NORWEGIAN_BLUE -> calculateNorwegianBlueParrotSpeed();
        };
    }

    private double calculateEuropeanParrotSpeed() {
        return getBaseSpeed();
    }

    private double calculateAfricanParrotSpeed() {
        double baseSpeed = getBaseSpeed();
        double loadFactor = getLoadFactor();
        double speedReduction = loadFactor * numberOfCoconuts;
        return Math.max(0, baseSpeed - speedReduction);
    }

    private double calculateNorwegianBlueParrotSpeed() {
        if (isNailed) {
            return 0;
        }
        return getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        if (voltage <= 0) {
            return 0;
        }
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
