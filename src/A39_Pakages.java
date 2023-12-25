import java.util.*; //Package for all Classes
import java.util.Scanner; // Package for only scanner Class

public class A39_Pakages {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);// Use After Addition of packages
       // System.out.println("Enter Number ");
        //int A= sc.nextInt();
        //System.out.println("This is my Scanner Output " + A);

        java.util.Scanner sc1 = new java.util.Scanner(System.in); // Use when no packages is added
        System.out.println("Enter Number ");
        int B=sc1.nextInt();
       System.out.println("This is My Scanner output Without Adding Packages " + B);
    }
}