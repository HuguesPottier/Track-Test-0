package basic.solutions;


public class MethodsCodelab06Solution {

    public static void main(String[] args) {
        String str = String.format("%1.2f", add(80.51, 10.01));
        System.out.println(str);
    }

    private static double add(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }

}
