package InputTaker;

import java.util.Scanner;

public class InputTaker {
    Scanner scanner = new Scanner(System.in);
    String stringInput;
    int intInput;
    double doubleInput;

    public String takeStringInput(){
        stringInput = scanner.nextLine();
        return stringInput;
    }
    public Integer takeIntInput(){
        intInput = scanner.nextInt();
        return intInput;
    }
    public double takeDoubleInput(){
        doubleInput = scanner.nextDouble();
        return doubleInput;
    }
    public String getStringInput() {
        return stringInput;
    }

    public double getDoubleInput() {
        return doubleInput;
    }
}
