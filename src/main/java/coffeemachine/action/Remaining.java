package coffeemachine.action;

public class Remaining extends Action {

    public void getAction() {
        System.out.println("The coffee machine has: ");
        System.out.println(firstMachineResource.WATER.getValue() + "ml of water");
        System.out.println(firstMachineResource.MILK.getValue() + "ml of milk");
        System.out.println(firstMachineResource.BEANS.getValue() + "g of coffee beans");
        System.out.println(firstMachineResource.CUPS.getValue() + " of disposable cups");
        System.out.println(money.MONEY.getValue() + " of money");
    }
}
