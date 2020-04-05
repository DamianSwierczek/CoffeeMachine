package coffeemachine.action;

public class FillResource extends Action {

    public void getAction() {
        System.out.println("Write how many ml of water do you want to add: ");
        firstMachineResource.WATER.setValue(firstMachineResource.WATER.getValue() + scanner.nextInt());
        System.out.println("Write how many ml of milk do you want to add: ");
        firstMachineResource.MILK.setValue(firstMachineResource.MILK.getValue() + scanner.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        firstMachineResource.BEANS.setValue(firstMachineResource.BEANS.getValue() + scanner.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        firstMachineResource.CUPS.setValue(firstMachineResource.CUPS.getValue() + scanner.nextInt());
    }
}
