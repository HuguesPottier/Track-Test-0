package advanced.solutions;

import java.util.Arrays;

public class RecursiveFunctionsCodelab04Solution {

    /**
     * Write a recursive function that will return an array that
     * is in the reverse order of the given array
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reverse(array)));//should print out 10,9,8,7,6,5,4,3,2,1
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        reverse(array, result, 1);
        return result;
    }

    private static void reverse(int[] start, int[] result, int index) {
        if(index > start.length) {
            return;
        }
        result[start.length - index] = start[index - 1];
        reverse(start, result, ++index);
    }

}
