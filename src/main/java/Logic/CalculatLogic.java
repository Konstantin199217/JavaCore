package Logic;

import Model.Calculator;

import java.util.Scanner;

public class CalculatLogic {
    public void start() {
        String nums = getNums();
        calculate(nums);
    }

    public void startTest(int a, String b, int c) {
        String nums = a + " " + b + " " + c;
        calculate(nums);
    }

    private String getNums() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел");
        String nums = scanner.nextLine();
        scanner.close();
        return nums;
    }

    private void calculate(String nums) {
        String[] number = nums.split(" ");
        double num1 = Double.parseDouble(number[0]);
        String act = number[1];
        double num2 = Double.parseDouble(number[2]);
        Calculator calculator = new Calculator(num1, num2);
        switch (act) {
            case "+" -> {
                calculator.addition();
                System.out.printf("%.2f + %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            case "-" -> {
                calculator.subtraction();
                System.out.printf("%.2f - %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            case "/" -> {
                calculator.division();
                System.out.printf("%.2f / %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            case "*" -> {
                calculator.multiplication();
                System.out.printf("%.2f * %.2f = %.2f",
                        num1,
                        num2,
                        calculator.getResult());
            }
            default -> System.out.println("Введен некорректный знак!");
        }
    }
}
