import java.util.Scanner;
public class A5_Exercise1_Percentage
{
    public static void main(String[] args) {
        System.out.println(" Finding Percentage ");

        Scanner sc = new Scanner(System.in);
        System.out.print(" Subject 1 Marks: ");
        float a = sc.nextFloat();
        System.out.print(" Subject 2 Marks: ");
        float b = sc.nextFloat();
        System.out.print(" Subject 3 Marks: ");
        float c = sc.nextFloat();
        System.out.print(" Subject 4 Marks: ");
        float d = sc.nextFloat();
        System.out.print(" Subject 5 Marks: ");
        float e = sc.nextFloat();

       float Total_Obt = a+b+c+d+e;
       float Total_Marks = 500;
       float Percentage = Total_Obt/Total_Marks*100;

        System.out.println(" Percentage of the Student is: " + Percentage );
    }
}
