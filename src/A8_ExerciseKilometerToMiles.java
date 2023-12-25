import java.awt.*;
import java.util.Scanner;

public class A8_ExerciseKilometerToMiles {
    public static void main(String[] args) {
        System.out.println(" Take Input from User Km and convert it Miles ");

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Value in Km: ");
        double a = sc.nextDouble();

        double Miles = a*0.621371;

        System.out.println(" The Value in Miles is: " + Miles );
    }
}
