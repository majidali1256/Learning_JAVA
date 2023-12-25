import java.util.Scanner;

public class A15_Exercise1StringToLowerCase {
    public static void main(String[] args) {
        System.out.println("Convert String to Lower Case");

        String Name = "MAJID ALI";
        System.out.println(Name.toLowerCase());

        System.out.println("Replace Spaces with UnderScores");

        String Line = "MY NAME IS MAJID ALI";
        System.out.println(Line.replace(" ","_"));

        System.out.println("Replacing Person Name in the Letter");
        String Line2 = "Dear Name1: \n Hello How are you! \n I hope You are absolutly Fine. \n Than You \n" +
                "Your Lovely Friend, \n Name2 ";
        System.out.println(Line2.replace("Name1","MAJID ALI " ).replace("Name2","XYZ"));

        System.out.println("Detect any character from string");
        System.out.println(Line.indexOf("MA"));

        System.out.println("Use if Escape Letter Squence");
        System.out.println("\"My Name is Majid Ali, I am BsCs\\Computer Science Student\".");
    }
}
