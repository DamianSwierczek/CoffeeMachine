package Enums;

public enum Resources {
    MILK(400),
    WATER(540),
    CUPS(12),
    BEANS(300);

    private int value;

    Resources(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
