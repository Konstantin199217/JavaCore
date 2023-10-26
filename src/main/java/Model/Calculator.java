package Model;

public class Calculator {
    //Первое число
    private final double num1;

    // Второе число
    private final double num2;

    // Результат вычесления
    private double result;

    //Коструктор класса
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double getResult() {
        return result;
    }

    //Сложение двух чисел.

    public void addition() {
        result = num1 + num2;
    }


    //Вычитание двух чисел.

    public void subtraction() {
        result = num1 - num2;
    }

    //Деление двух чисел.

    public void division() {
        result = num1 / num2;
    }

    //Умножение двух чисел.

    public void multiplication() {
        result = num1 * num2;
    }

}
