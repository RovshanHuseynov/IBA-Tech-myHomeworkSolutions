package hw.hw6;

enum Species {
    CAT(1),
    DOG(2),
    BIRD(3),
    GOAT(4),
    SHEEP(5);

    private int id;

    Species(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
