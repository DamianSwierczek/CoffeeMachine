package Actions;

public class Buy extends Action {

    public void getAction() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, 4 - back to main menu.");
        takeStringInput();
        switch (getStringInput()) {
            case "1":
                if (resources.WATER.getValue() < coffeeVariations.ESPRESSO.getWaterSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough water");
                    break;
                } else if (resources.MILK.getValue() < coffeeVariations.ESPRESSO.getMilkSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough milk");
                    break;
                } else if (resources.BEANS.getValue() < coffeeVariations.ESPRESSO.getCoffeeBeans()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough coffee beans");
                    break;
                } else if (resources.CUPS.getValue() < 1) {
                    System.out.println("Sorry, can't get you a coffee. Not enough cups.");
                    break;
                } else {
                    tossACoinToYourMachine(getStringInput());
                    System.out.println("Preparing a coffee..");
                    resources.WATER.setValue(resources.WATER.getValue() - coffeeVariations.ESPRESSO.getWaterSize());
                    resources.MILK.setValue(resources.MILK.getValue() - coffeeVariations.ESPRESSO.getMilkSize());
                    resources.BEANS.setValue(resources.BEANS.getValue() - coffeeVariations.ESPRESSO.getCoffeeBeans());
                    resources.CUPS.setValue(resources.CUPS.getValue() - 1);
                    money.MONEY.setValue(money.MONEY.getValue() + coffeeVariations.ESPRESSO.getCost());
                    break;
                }
            case "2":
                if (resources.WATER.getValue() < coffeeVariations.LATTE.getWaterSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough water");
                    break;
                } else if (resources.MILK.getValue() < coffeeVariations.LATTE.getMilkSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough milk");
                    break;
                } else if (resources.BEANS.getValue() < coffeeVariations.LATTE.getCoffeeBeans()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough coffee beans");
                    break;
                } else if (resources.CUPS.getValue() < 1) {
                    System.out.println("Sorry, can't get you a coffee. Not enough cups.");
                    break;
                } else {
                    tossACoinToYourMachine(getStringInput());
                    System.out.println("Preparing a coffee..");
                    resources.WATER.setValue(resources.WATER.getValue() - coffeeVariations.LATTE.getWaterSize());
                    resources.MILK.setValue(resources.MILK.getValue() - coffeeVariations.LATTE.getMilkSize());
                    resources.BEANS.setValue(resources.BEANS.getValue() - coffeeVariations.LATTE.getCoffeeBeans());
                    resources.CUPS.setValue(resources.CUPS.getValue() - 1);
                    money.MONEY.setValue(money.MONEY.getValue() + coffeeVariations.LATTE.getCost());
                    break;
                }
            case "3":
                if (resources.WATER.getValue() < coffeeVariations.CAPPUCINO.getWaterSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough water");
                    break;
                } else if (resources.MILK.getValue() < coffeeVariations.CAPPUCINO.getMilkSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough milk");
                    break;
                } else if (resources.BEANS.getValue() < coffeeVariations.CAPPUCINO.getCoffeeBeans()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough coffee beans");
                    break;
                } else if (resources.CUPS.getValue() < 1) {
                    System.out.println("Sorry, can't get you a coffee. Not enough cups.");
                    break;
                } else {
                    tossACoinToYourMachine(getStringInput());
                    System.out.println("Preparing a coffee..");
                    resources.WATER.setValue(resources.WATER.getValue() - coffeeVariations.CAPPUCINO.getWaterSize());
                    resources.MILK.setValue(resources.MILK.getValue() - coffeeVariations.CAPPUCINO.getMilkSize());
                    resources.BEANS.setValue(resources.BEANS.getValue() - coffeeVariations.CAPPUCINO.getCoffeeBeans());
                    resources.CUPS.setValue(resources.CUPS.getValue() - 1);
                    money.MONEY.setValue(money.MONEY.getValue() + coffeeVariations.CAPPUCINO.getCost());
                    break;
                }
            case "4":
                break;
            default:
                System.out.println("Bad choice, try once again");
                break;
        }
    }

    public void tossACoinToYourMachine(String input) {

        switch (input) {
            case "1":
                System.out.println("Toss a coin to machine.");
                System.out.println("Remaining: \n" + coffeeVariations.ESPRESSO.getCost() + "zł\n" + "Example: 0,50");
                takeDoubleInput();
                double espressoCost = coffeeVariations.ESPRESSO.getCost() - getDoubleInput();
                System.out.println("Remaining: ");
                System.out.format("%.2f zł %n", espressoCost);
                int espressoExiter = 0;
                while(espressoExiter != 1) {
                    if (espressoCost > 0) {
                        double tempEspressoCost = espressoCost;
                        System.out.println("Toss a coin to machine.");
                        takeDoubleInput();
                        espressoCost = tempEspressoCost - getDoubleInput();
                        if(espressoCost > 0) {
                            System.out.println("Remaining: ");
                            System.out.format("%.2f zł %n", espressoCost);
                        }
                    } else if (espressoCost <= 0) {
                        System.out.println("Here's your change: ");
                        System.out.format("%.2f zł %n", espressoCost);
                        espressoExiter = 1;
                        break;
                    }
                }
                break;
            case "2":
                System.out.println("Toss a coin to machine.");
                System.out.println("Remaining: \n" + coffeeVariations.LATTE.getCost() + "złn" + "Example: 0,50");
                takeDoubleInput();
                double latteCost = coffeeVariations.LATTE.getCost() - getDoubleInput();
                System.out.println("Remaining: ");
                System.out.format("%.2f zł %n", latteCost);
                int latteExiter = 0;
                while(latteExiter != 1) {
                    if (latteCost > 0) {
                        double tempLatteCost = latteCost;
                        System.out.println("Toss a coin to machine.");
                        takeDoubleInput();
                        latteCost = tempLatteCost - getDoubleInput();
                        if(latteCost > 0){
                            System.out.println("Remaining: ");
                            System.out.format("%.2f zł %n", latteCost);
                        }
                    } else if (latteCost <= 0) {
                        System.out.println("Here's your change: ");
                        System.out.format("%.2f zł %n", latteCost);
                        latteExiter = 1;
                        break;
                    }
                }
                break;
            case "3":
                System.out.println("Toss a coin to machine.");
                System.out.println("Remaining: \n" + coffeeVariations.CAPPUCINO.getCost() + "złn" + "Example: 0,50");
                takeDoubleInput();
                double cappucinoCost = coffeeVariations.CAPPUCINO.getCost() - getDoubleInput();
                System.out.println("Remaining: ");
                System.out.format("%.2f zł %n", cappucinoCost);
                int cappucinoExiter = 0;
                while(cappucinoExiter != 1) {
                    if (cappucinoCost > 0) {
                        double tempCappucinoCost = cappucinoCost;
                        System.out.println("Toss a coin to machine.");
                        takeDoubleInput();
                        cappucinoCost = tempCappucinoCost - getDoubleInput();
                        if(cappucinoCost > 0){
                            System.out.println("Remaining: ");
                            System.out.format("%.2f zł %n", cappucinoCost);
                        }
                    } else if (cappucinoCost <= 0) {
                        System.out.println("Here's your change: ");
                        System.out.format("%.2f zł %n", cappucinoCost);
                        cappucinoExiter = 1;
                        break;
                    }
                }
                break;
        }

    }
}
