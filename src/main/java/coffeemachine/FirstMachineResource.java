package coffeemachine;

public enum FirstMachineResource {
    MILK(400),
    WATER(540),
    CUPS(12),
    BEANS(300);

    private int value;

    FirstMachineResource(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
