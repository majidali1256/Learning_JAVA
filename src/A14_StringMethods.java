import java.util.Locale;
import java.util.Scanner;
public class A14_StringMethods {
    public static void main(String[] args) {

        System.out.println(" String Methods ");

        // For length of String
        String Name = "MAJID ALI";
        int Length = Name.length();
        System.out.println("Length of String is: " + Length);

        // For Lower Case
        String LC = Name.toLowerCase();
        System.out.println(LC);

        // For Upper Case
        String Name1 = "majid ali";
        String UC = Name1.toUpperCase();
        System.out.println(UC);

        // For Trim a String it removes left right spaces
        String TM = Name1.trim();
        System.out.println(TM);

        //For Substring (if we give start only It trims before given index)
        System.out.println(Name1.substring(7));
        // if we give both start and end it includes start element but not the end one
        System.out.println(Name1.substring(3,6));

        // For Replace any Character from string
        System.out.println(Name1.replace('i','e'));

        // Check Starting Character
        System.out.println(Name1.startsWith("m"));

        // Check ending Character
        System.out.println(Name1.endsWith("i"));

        // To Check char at index
        System.out.println(Name1.charAt(6));

        // To check index Number of Char
        System.out.println(Name1.indexOf("d"));

       // To check index of a String, print Starting index
        System.out.println(Name1.indexOf("i"));

        // To Check Starting but giving starting index to check
        System.out.println(Name1.indexOf("i" , 2));

        // To check Last Index of String
        System.out.println(Name1.lastIndexOf("i"));

        // To check Last Index of String but giving index to start checking
        System.out.println(Name1.lastIndexOf("i" ,8));

        // To check Equality
        System.out.println(Name1.equals("MAJID ALI"));

        // TO Check Eualit But Ignore Case
        System.out.println(Name1.equalsIgnoreCase("MAJID ALI"));


    }


}
