import java.util.Scanner;
public class A18_BreakAndContinueInLoop {
    public static void main(String[] args) {
        System.out.println("Use of Break and Continue in Loops\n");

        //Break For Loop
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("\nLoop Has Stopped");
                break;
            }
            System.out.print(i + " ");
        }

        //Break in While Loop
        int j = 5;
        while (j > 0) {
            System.out.print(j + " ");
            if (j == 2) {
                System.out.println(" Loop has Broke");
                break;
            }
            j--; }

        //Continue in For Loop
            for (int k = 0; k < 5; k++) {

                if (k == 3) {
                    System.out.print("Skipped 3 ");
                    continue;
                }
                System.out.print(k + " ");
            }
        }
}

