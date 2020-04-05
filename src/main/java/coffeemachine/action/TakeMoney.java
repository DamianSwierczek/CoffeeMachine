package coffeemachine.action;

public class TakeMoney extends Action {

    public void getAction() {
        {
            System.out.println("I gave you $" + money.MONEY.getValue());
            money.MONEY.setValue(0);
        }
    }
}
