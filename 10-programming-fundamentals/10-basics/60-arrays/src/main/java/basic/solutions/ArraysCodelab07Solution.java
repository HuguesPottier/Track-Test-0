package basic.solutions;

public class ArraysCodelab07Solution {


    /**
     * Change the following code so that it uses an array instead of a list of variables.
     * Can you see that after the change this code has become more flexible?
     */
    public static void main(String[] args) {
        double[] numbers = new double[]{34, 12, 24, 89, 10, 96, 74, 67, 46, 53};
        System.out.println("The average is: " + calculateSumOrAverage(numbers));
    }

    private static double calculateSumOrAverage(double[] numbers) {
        double sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        return sum / 10;
    }
}
