package coffeemachine.action;

public class Buy extends Action {

    public void getAction() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, 4 - back to main menu.");
        String buyInput = scanner.nextLine();
        switch (buyInput) {
            case "1":
                if (firstMachineResource.WATER.getValue() < coffeeVariation.ESPRESSO.getWaterSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough water");
                    break;
                } else if (firstMachineResource.MILK.getValue() < coffeeVariation.ESPRESSO.getMilkSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough milk");
                    break;
                } else if (firstMachineResource.BEANS.getValue() < coffeeVariation.ESPRESSO.getCoffeeBeans()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough coffee beans");
                    break;
                } else if (firstMachineResource.CUPS.getValue() < 1) {
                    System.out.println("Sorry, can't get you a coffee. Not enough cups.");
                    break;
                } else {
                    tossACoinToYourMachine(buyInput);
                    System.out.println("Preparing a coffee..");
                    firstMachineResource.WATER.setValue(firstMachineResource.WATER.getValue() - coffeeVariation.ESPRESSO.getWaterSize());
                    firstMachineResource.MILK.setValue(firstMachineResource.MILK.getValue() - coffeeVariation.ESPRESSO.getMilkSize());
                    firstMachineResource.BEANS.setValue(firstMachineResource.BEANS.getValue() - coffeeVariation.ESPRESSO.getCoffeeBeans());
                    firstMachineResource.CUPS.setValue(firstMachineResource.CUPS.getValue() - 1);
                    money.MONEY.setValue(money.MONEY.getValue() + coffeeVariation.ESPRESSO.getCost());
                    break;
                }
            case "2":
                if (firstMachineResource.WATER.getValue() < coffeeVariation.LATTE.getWaterSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough water");
                    break;
                } else if (firstMachineResource.MILK.getValue() < coffeeVariation.LATTE.getMilkSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough milk");
                    break;
                } else if (firstMachineResource.BEANS.getValue() < coffeeVariation.LATTE.getCoffeeBeans()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough coffee beans");
                    break;
                } else if (firstMachineResource.CUPS.getValue() < 1) {
                    System.out.println("Sorry, can't get you a coffee. Not enough cups.");
                    break;
                } else {
                    tossACoinToYourMachine(buyInput);
                    System.out.println("Preparing a coffee..");
                    firstMachineResource.WATER.setValue(firstMachineResource.WATER.getValue() - coffeeVariation.LATTE.getWaterSize());
                    firstMachineResource.MILK.setValue(firstMachineResource.MILK.getValue() - coffeeVariation.LATTE.getMilkSize());
                    firstMachineResource.BEANS.setValue(firstMachineResource.BEANS.getValue() - coffeeVariation.LATTE.getCoffeeBeans());
                    firstMachineResource.CUPS.setValue(firstMachineResource.CUPS.getValue() - 1);
                    money.MONEY.setValue(money.MONEY.getValue() + coffeeVariation.LATTE.getCost());
                    break;
                }
            case "3":
                if (firstMachineResource.WATER.getValue() < coffeeVariation.CAPPUCINO.getWaterSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough water");
                    break;
                } else if (firstMachineResource.MILK.getValue() < coffeeVariation.CAPPUCINO.getMilkSize()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough milk");
                    break;
                } else if (firstMachineResource.BEANS.getValue() < coffeeVariation.CAPPUCINO.getCoffeeBeans()) {
                    System.out.println("Sorry, can't get you a coffee. Not enough coffee beans");
                    break;
                } else if (firstMachineResource.CUPS.getValue() < 1) {
                    System.out.println("Sorry, can't get you a coffee. Not enough cups.");
                    break;
                } else {
                    tossACoinToYourMachine(buyInput);
                    System.out.println("Preparing a coffee..");
                    firstMachineResource.WATER.setValue(firstMachineResource.WATER.getValue() - coffeeVariation.CAPPUCINO.getWaterSize());
                    firstMachineResource.MILK.setValue(firstMachineResource.MILK.getValue() - coffeeVariation.CAPPUCINO.getMilkSize());
                    firstMachineResource.BEANS.setValue(firstMachineResource.BEANS.getValue() - coffeeVariation.CAPPUCINO.getCoffeeBeans());
                    firstMachineResource.CUPS.setValue(firstMachineResource.CUPS.getValue() - 1);
                    money.MONEY.setValue(money.MONEY.getValue() + coffeeVariation.CAPPUCINO.getCost());
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
                System.out.println("Remaining: \n" + coffeeVariation.ESPRESSO.getCost() + "zł\n" + "Example: 0,50");
                double espressoCoinValue = scanner.nextDouble();
                double espressoCost = coffeeVariation.ESPRESSO.getCost() - espressoCoinValue;
                System.out.println("Remaining: ");
                System.out.format("%.2f zł %n", espressoCost);
                int espressoExiter = 0;
                while (espressoExiter != 1) {
                    if (espressoCost > 0) {
                        double tempEspressoCost = espressoCost;
                        System.out.println("Toss a coin to machine.");
                        double tempEspressoCoinValue = scanner.nextDouble();
                        espressoCost = tempEspressoCost - tempEspressoCoinValue;
                        if (espressoCost > 0) {
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
                System.out.println("Remaining: \n" + coffeeVariation.LATTE.getCost() + "złn" + "Example: 0,50");
                double coinLatteValue = scanner.nextDouble();
                double latteCost = coffeeVariation.LATTE.getCost() - coinLatteValue;
                System.out.println("Remaining: ");
                System.out.format("%.2f zł %n", latteCost);
                int latteExiter = 0;
                while (latteExiter != 1) {
                    if (latteCost > 0) {
                        double tempLatteCost = latteCost;
                        System.out.println("Toss a coin to machine.");
                        double tempCoinLatteValue = scanner.nextDouble();
                        latteCost = tempLatteCost - tempCoinLatteValue;
                        if (latteCost > 0) {
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
                System.out.println("Remaining: \n" + coffeeVariation.CAPPUCINO.getCost() + "złn" + "Example: 0,50");
                double coinCappucinoValue = scanner.nextDouble();
                double cappucinoCost = coffeeVariation.CAPPUCINO.getCost() - coinCappucinoValue;
                System.out.println("Remaining: ");
                System.out.format("%.2f zł %n", cappucinoCost);
                int cappucinoExiter = 0;
                while (cappucinoExiter != 1) {
                    if (cappucinoCost > 0) {
                        double tempCappucinoCost = cappucinoCost;
                        System.out.println("Toss a coin to machine.");
                        double coinTempCappucinoValue = scanner.nextDouble();
                        cappucinoCost = tempCappucinoCost - coinTempCappucinoValue;
                        if (cappucinoCost > 0) {
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
