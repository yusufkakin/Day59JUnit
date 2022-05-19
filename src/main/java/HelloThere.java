import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String howYou = scanner.nextLine();
        System.out.println("Wow - Interesting. Tell me more about yourself!");
        String tellMe = scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
    }
}
