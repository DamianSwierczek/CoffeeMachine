package Main;

import Actions.*;
import InputTaker.InputTaker;

public class MainCoffee {
    public static void main(String[] args) {

        MainCoffee mainObject = new MainCoffee();
        InputTaker inputTaker = new InputTaker();

        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            inputTaker.takeStringInput();
            mainObject.callToAction(inputTaker.getStringInput()).getAction();
        }
    }

    public Action callToAction(String action) {

        Action kawa = null;
        if (action.equals("remaining")) {
            kawa = new Remaining();
        } else if (action.equals("buy")) {
            kawa = new Buy();
        } else if (action.equals("fill")){
            kawa = new FillResources();
        } else if (action.equals("take")){
            kawa = new TakeMoney();
        } else if (action.equals("exit")) {
            System.out.println("Goodbye");
            System.exit(0);
        } else {
            kawa = new Action();
        }
        return kawa;
    }
}
