package Actions;

public class Remaining extends Action {

    public void getAction() {
        System.out.println("The coffee machine has: ");
        System.out.println(resources.WATER.getValue() + "ml of water");
        System.out.println(resources.MILK.getValue() + "ml of milk");
        System.out.println(resources.BEANS.getValue() + "g of coffee beans");
        System.out.println(resources.CUPS.getValue() + " of disposable cups");
        System.out.println(money.MONEY.getValue() + " of money");
    }
}
