import java.util.Scanner;
public class A19_Exercise {
    public static void main(String[] args) {
        System.out.println(" Printing Stars in Accending");
        int n=5;
        for (int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
        }
        System.out.print("\n");
    }
        System.out.println(" Printing Stars in Decending");
        for(int i=5; i>0; i--){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println(" Sum of First 5 Even numbers with while loop ");
        int i=0;
        int sum =0;
        while(i<5){
            sum = sum+2*i;
            i++;
}
        System.out.println("The Sum is: " + sum);

        System.out.println(" Multiplication Table of 10 in Reverse");
        int mul=0;
        for (int a=10; a>0; a--){
            mul=10*a;
            System.out.println("10"+"*"+a+"="+ mul);
        }

        System.out.println(" Factorial of 5");
        int b=1;
        int fatorial=1;
        while(b<=5){
            fatorial *=b;
            b++;
        }
        System.out.println("Factorial is: " + fatorial);
    }
}