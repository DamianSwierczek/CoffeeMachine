package Actions;

import Enums.CoffeeVariations;
import Enums.Money;
import Enums.Resources;
import InputTaker.InputTaker;

public class Action extends InputTaker{

    Resources resources;
    CoffeeVariations coffeeVariations;
    Money money;

    public void getAction(){
        System.out.println( "Wrong action");
    }

}
