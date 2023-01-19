package basic;

public class ArraysCodelab07 {


    /**
     * Change the following code so that it uses an array instead of a list of variables.
     * Can you see that after the change this code has become more flexible?
     */
    public static void main(String[] args) {
        double number1 = 34;
        double number2 = 12;
        double number3 = 24;
        double number4 = 89;
        double number5 = 10;
        double number6 = 96;
        double number7 = 74;
        double number8 = 67;
        double number9 = 46;
        double number10 = 53;

        System.out.println("The average is: " + calculateSumOrAverage(number1, number2, number3, number4, number5, number6, number7, number8, number9, number10));
    }

    private static double calculateSumOrAverage(double number1, double number2, double number3, double number4, double number5, double number6, double number7, double number8, double number9, double number10) {
        double sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
        return sum / 10;
    }
}
