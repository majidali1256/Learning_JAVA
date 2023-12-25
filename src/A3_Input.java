
import java.util.Scanner;

public   class A3_Input {
    public static void main(String[] args) {
        System.out.println(" Taking Input from the User ");
        System.out.println(" Check Number if it is Greater than 10 or Not ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number: ");
        int x = sc.nextInt();
        System.out.println(x>10);

        System.out.println(" Now Enter Numbers for Multliplication ");
        System.out.print(" Enter Num 1: ");
        int a = sc.nextInt();
        System.out.print(" Enter Num 2: ");
         int b = sc.nextInt();

        int Mul = a*b;

        System.out.println(" Sum of a & b is: " + Mul );

        System.out.println(" Lets Taking String Input ");
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" Enter a String: ");
        String c = sc.nextLine();
        System.out.println("String is: " + c );

    }

}