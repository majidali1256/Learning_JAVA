import java.util.Random;

public class A17_Loops {
    public static void main(String[] args) {
        System.out.println("Writting Loops");
        System.out.println("For Loop");
        for (int i=10; i>0; i--){
            System.out.print(i + " ");
        }

        System.out.println("\nWhile Loop");
        int j=0;
        while(j<10){
            System.out.print(j + " ");
            ++j;
        }

        System.out.println(" \nDo-While Loop");
        int k =10;
        do {
            System.out.println(k);
            k+=2;

        }
        while (k<15);
        }
    }

