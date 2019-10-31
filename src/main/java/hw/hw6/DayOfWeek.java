package hw.hw6;

enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int numberofDay;

    DayOfWeek(int numberofDay) {
        this.numberofDay = numberofDay;
    }

    public int getNumberofDay() {
        return numberofDay;
    }
}
