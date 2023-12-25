import java.util.Scanner;
public class A24_Recursion {
    // Factorial Using Recusion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //Sum of First Natural Numbers
    static int Faminachi(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a + Faminachi(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        System.out.println(" Factorial of N is: " + factorial(x));

        System.out.println(Faminachi(5));
    }
}