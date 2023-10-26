package Sample;


import logic.CalculateLogic;

public class Main {
    public static void main(String[] args) {
        CalculateLogic test = new CalculateLogic();
        test.startTest(2,"+",2);
        System.out.println(" ");
        test.startTest(2,"/",2);
        System.out.println(" ");
        test.startTest(2,"-",2);
        System.out.println(" ");
        test.startTest(2,"*",2);

    }
}