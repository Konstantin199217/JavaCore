package Sample;

import Logic.CalculatLogic;
public class Main {
    public static void main(String[] args) {
        CalculatLogic test = new CalculatLogic();
        test.startTest(2,"+",2);
        System.out.println(" ");
        test.startTest(2,"/",2);
        System.out.println(" ");
        test.startTest(2,"-",2);
        System.out.println(" ");
        test.startTest(2,"*",2);

    }
}