public class Calculator {
    public static void main(String[] args) {
        sumNumbers(1, 2);
        sumNumbers(3, 4);
        sumNumbers(5, 6);
    }

    public static void sumNumbers (int number1, int number2) {
        int sum = number1 + number2;
        System.out.println(sum);
    }
}
