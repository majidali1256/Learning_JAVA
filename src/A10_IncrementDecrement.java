
import java.util.Scanner;
public class A10_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println(" Increment and Decrement ");

        int a = 8;
        int b = a++; // It means first use value of a and then increment it.
        System.out.println(" First Value: " + b); // it will print 8
        System.out.println(" Second Value: " + a); // it will print 9

        int c = 10;
        ++c; // First increment the value and then use it
        System.out.println(" Value is: " + c); // it will show 11

        int d = 5;
       int e = d--;
        System.out.println(" Value 1: " + e); //original Before decrement
        System.out.println(" Value 2: " + d); // value after decrement

        int f = 4;
        --f;
        System.out.println(" Value is: "  + f);

        System.out.println(" For characters ");
        char m = 'M';
       ++m;
        System.out.println(m);
    }

}
