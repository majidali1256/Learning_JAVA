import java.util.Scanner;

public class A6_ExerciseSumThreeNumbers {
    public static void main(String[] args) {
        System.out.println( " Sum three Numbers ");

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter First Number: ");
        int a = sc.nextInt();
        System.out.print(" Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print( " Enter Third Number: ");
        int c = sc.nextInt();

       int Sum = a+b+c;
        System.out.println(" The Sum is: "+ Sum );
    }
}
