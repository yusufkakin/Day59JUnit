public class MethodReturnTypes {

    public static void main(String[] args) {
        System.out.println(stringCaller("String of text"));
        System.out.println(intCaller(5));
        System.out.println(boolCaller(false));
    }

    public static String stringCaller(String stringInput) {
        return stringInput;
    }

    public static int intCaller(int intInput) {
        return intInput;
    }

    public static boolean boolCaller(boolean boolInput) {
        return boolInput;
    }


}
