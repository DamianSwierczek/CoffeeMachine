package coffeemachine;

public enum Money {
    MONEY(500);

    private double value;

    Money (double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

