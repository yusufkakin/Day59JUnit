public class DivideMethod {
    public static void main(String[] args) {
        divide(1,3);
    }

    public static double divide(double num1, double num2){
        double divider = num1/num2;
        System.out.println((int)num1 + " / " + (int)num2 + " = " + divider);
        return divider;
    }
}
