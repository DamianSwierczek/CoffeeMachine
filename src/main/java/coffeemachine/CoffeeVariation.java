package coffeemachine;

public enum CoffeeVariation {
    ESPRESSO(200, 0, 16, 3.50),
    LATTE(350, 75, 20, 5.50),
    CAPPUCINO(200, 100, 12, 6.50);

    private final int waterSize;
    private final int milkSize;
    private final int coffeeBeans;
    private final double cost;

    CoffeeVariation(int waterSize, int milkSize, int coffeeBeans, double cost) {
        this.waterSize = waterSize;
        this.milkSize = milkSize;
        this.coffeeBeans = coffeeBeans;
        this.cost = cost;
    }

    public int getWaterSize() {
        return waterSize;
    }

    public int getMilkSize() {
        return milkSize;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public double getCost() {
        return cost;
    }
}
