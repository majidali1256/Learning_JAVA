import java.util.Scanner;
public class A11_ExerciseIncrementCharacter {
    public static void main(String[] args) {
        System.out.println(" Take Character/Alphabet as as input and show Next in Output ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter A Character: ");
        char a = sc.next().charAt(0);
        ++a;

        System.out.println(" The Next Character is: " + a);
    }
}

