package coffeemachine;

import coffeemachine.action.Action;
import coffeemachine.action.Buy;
import coffeemachine.action.FillResource;
import coffeemachine.action.Remaining;
import coffeemachine.action.TakeMoney;
import java.util.Scanner;

public class MainCoffee {
    public static void main(String[] args) {

        MainCoffee mainObject = new MainCoffee();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String actionInput = scanner.nextLine();
            mainObject.callToAction(actionInput).getAction();
        }
    }

    public Action callToAction(String action) {

        Action kawa = null;
        if (action.equals("remaining")) {
            kawa = new Remaining();
        } else if (action.equals("buy")) {
            kawa = new Buy();
        } else if (action.equals("fill")) {
            kawa = new FillResource();
        } else if (action.equals("take")) {
            kawa = new TakeMoney();
        } else if (action.equals("exit")) {
            System.out.println("Goodbye");
            System.exit(0);
        } else {
            System.out.println("Wrong action");
        }
        return kawa;
    }
}
