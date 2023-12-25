import java.util.Scanner;

public class A7_TakeNameAndGreet {
    public static void main(String[] args) {
        System.out.println(" Take Name as Input and Greet Them ");

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your Name: ");
        String a = sc.nextLine();

        System.out.println(" Hello Mr. " + a + " Have a Nice Day ");
    }
}
