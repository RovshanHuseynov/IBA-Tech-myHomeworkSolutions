package hw.hw7;

enum Species {
    CAT(false, 4, false),
    DOG(false, 4, false),
    BIRD(true, 2, false),
    GOAT(false, 4, true),
    SHEEP(false, 4, true);

    private boolean canFly;
    private int numberOfLegs;
    private boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
