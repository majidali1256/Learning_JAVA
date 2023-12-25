import java.util.Scanner;

public class A9_CheckingInteger {
    public static void main(String[] args) {
        System.out.println(" Get Input Checking if the number is Integer or Not ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Number to Check: ");
        boolean a = sc.hasNextInt();

        System.out.println(" It is: " + a );


    }

}
