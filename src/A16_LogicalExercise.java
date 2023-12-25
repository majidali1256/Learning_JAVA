import java.util.Scanner;

public class A16_LogicalExercise {
    public static void main(String[] args) {
        System.out.println("Program to Find Pass or Fail, Student Should have 40 in total and 33 in each Subject");
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks: ");
       float S1 = sc.nextFloat();
        System.out.print("Enter Subject 2 Marks: ");
       float S2= sc.nextFloat();
        System.out.print("Enter Subject 3 Marks: ");
       float S3 = sc.nextFloat();

       float TM = 300f;
       Float OM = S1+S2+S3;
      float TP = OM/TM*100;
        System.out.println("Total Percentage is: " + TP);

      if (TP>=40 && S1>=33 && S2>=33 && S3>=33){
          System.out.println("You are Pass");
      }
      else {
          System.out.println("You are Fail");}

        System.out.println("Check Your website Type");
        System.out.print("Enter Your Website: ");
        String LastCharacters = sc.next();

        if(LastCharacters.endsWith(".com")) { System.out.println("It is Commercial Website"); }
       else if(LastCharacters.endsWith(".org")) { System.out.println("It is Organizational Website"); }
         else if (LastCharacters.endsWith(".pk")) { System.out.println("It is Pakistani Website"); }
    }
}
