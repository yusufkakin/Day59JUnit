public class AverageMethod {
    public static void main(String[] args) {

        System.out.println("The average is: " + average(4, 3, 2));
    }
    public static double sum(double num1, double num2, double num3){
        return num1+num2+num3;
    }
    public static double average(double num1, double num2, double num3){

        return sum(num1, num2, num3)/3;
    }
}
