package Actions;

public class FillResources extends Action {

    public void getAction(){
        System.out.println("Write how many ml of water do you want to add: ");
        resources.WATER.setValue(resources.WATER.getValue() + takeIntInput());
        System.out.println("Write how many ml of milk do you want to add: ");
        resources.MILK.setValue(resources.MILK.getValue() + takeIntInput());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        resources.BEANS.setValue(resources.BEANS.getValue() + takeIntInput());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        resources.CUPS.setValue(resources.CUPS.getValue() + takeIntInput());
    }
}
