package coffeemachine.action;

import java.util.Scanner;

import coffeemachine.CoffeeVariation;
import coffeemachine.FirstMachineResource;
import coffeemachine.Money;

public abstract class Action {

    protected FirstMachineResource firstMachineResource;
    protected CoffeeVariation coffeeVariation;
    protected Money money;

    Scanner scanner = new Scanner(System.in);

    public abstract void getAction();

}
