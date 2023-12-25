import java.sql.SQLOutput;
import java.util.Scanner;
public class A14_String {
    public static void main(String[] args) {
        System.out.println(" Take String as Input ");
        // First way
        Scanner sc = new Scanner(System.in);
        System.out.println(" For Single Word ");
        System.out.print(" Enter Your Name: ");
        String Name = sc.next(); // For single Word
        System.out.println(Name);

        // For a Sentence or multiple Words
        Scanner sc1 = new Scanner(System.in);
        System.out.println(" For Multiple Words ");
        System.out.print(" Enter your Name: ");
        String Name1 = sc1.nextLine();
        System.out.println(Name1);

    }
}
