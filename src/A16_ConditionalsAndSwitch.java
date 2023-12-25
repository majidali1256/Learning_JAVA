import java.util.Scanner;

public class A16_ConditionalsAndSwitch {
    public static void main(String[] args) {
        System.out.println("Conditionals Such as If Else");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age to Check If you Are Adult are not: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are not an Adult");
        }

        System.out.println(" Switch Statements ");
        System.out.print("Enter 1 For Male and 2 for Female: ");
        int b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.println("MALE");
                break;
            case 2:
                System.out.println("FEMALE");
                break;
            default:
                System.out.println("Wrong Input");
        }
                System.out.println("Check Your website Type");
                System.out.print("Enter You ending characters of Website( after last Fullstop");
                String LastCharacters = sc.next();

                switch (LastCharacters){
                    case ".com" -> System.out.println("It is Commertial Website");
                    case ".org" -> System.out.println("It is Organizational Website");
                    case ".pk" -> System.out.println("It is Pakistani Website");
                }
        }
    }

