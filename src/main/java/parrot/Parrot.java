package parrot;


public abstract class Parrot {
    protected static final double BASE_SPEED = 12.0;
    protected static final double MAX_SPEED = 24.0;
    protected static final double MIN_SPEED = 0.0;


    protected Parrot() {
    }


    public abstract double getSpeed();
    public abstract String getCry();


    public static Parrot createEuropeanParrot() {
        return new EuropeanParrot();
    }


    public static Parrot createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }


    public static Parrot createNorwegianBlueParrot(double voltage, boolean isNailed) {
        return new NorwegianBlueParrot(voltage, isNailed);
    }
}
