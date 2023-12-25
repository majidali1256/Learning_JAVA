import java.util.Scanner;
public class A16_logical {
    public static void main(String[] args) {
        System.out.println("Convert Bollean" );
        boolean a = true;
        System.out.println(!a);

        System.out.println(" Logical Signs");
        System.out.println("You Are Applying For a Scolarship");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Your Matric Marks: ");
        int MatricPercentage = sc.nextInt();
        System.out.print("Enter your FSC Marks: ");
        int FscPercentage = sc.nextInt();

        if(age<=25 && MatricPercentage>=80 && FscPercentage>=80){
            System.out.println("You Are Eligible for Full Scolarship");
        }
        if (age<=25 && MatricPercentage>=80|| FscPercentage>=80){
            System.out.println("You are Eligible for 70% Scolarship");
        }
        else {
            System.out.println("You Are Not Eligible for Scolarship");
        }
    }
}
