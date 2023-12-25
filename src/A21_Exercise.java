import java.util.Scanner;
public class A21_Exercise {
    public static void main(String[] args) {

        //Sum first 5 number of Array
        float[] array = {10f, 20f, 30f, 40f, 50f};
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum is: " + sum);

        float[] array1 = {10f, 20f, 30f, 40f, 50f};
        float sum1 = 0;
        for (float element : array1) {
            sum1 += element;
        }
        System.out.println("Sum is: " + sum1);

        //Checking if Number is present in array or not
        int[] array2 = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check: ");
        int num = sc.nextInt();
        boolean Check = false;
        for (int element : array2) {
            if (num == element) {
                Check = true;
                break;
            }
        }
        if (Check) {
            System.out.println(" Number is Found ");
        } else {
            System.out.println(" Not Found");
        }

        // average of Marks in Array
        float[] Marks = {90f, 80f, 70f, 60f, 50f};
        float Total = 0;
        for (float element : Marks) {
            Total += element;
        }
        System.out.println(" The Average is: " + Total / 5);

        // Add Two Matrices of 2x3
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Setting Values i=" + i + " and j=" + j);
            }
            System.out.println(""); }

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
                }
                System.out.println("");
            }

            //Revervese the Array
        int[] array3 = {10, 20, 30, 40, 50};
        System.out.print("ELEMENT IN REVERSE ARE ");
       for (int i= array3.length-1; i>=0; i--){
           System.out.print(array3[i] + " ");
       }

        //Maximum Number in the Array
        int[] array4 = {10, 20, 30, 40, 50};
       int Max = 0;

        for (int element:array4){
            if(Max<element){
                Max=element;
            }
            }
        System.out.println("\nMax Values is: " + Max);

        //Minimum Number in the Array
        int[] array5 = {10, 20, 30, -50, -19};
        int Min = 0;

        for (int element:array5){
            if(Min>element){
                Min=element;
            }
        }
        System.out.println("\nMin Values is: " + Min);

        //check if Array is Sorted or Not
        int[] array6 = {10, 90, 30, 40, 50};
        boolean aa = false;
        for (int i=0; i<array6.length-1; i++){
            if (array6[i]>array6[i+1]){
                aa = true;
                break;
            }
        }
        if (aa){
            System.out.println(" Array is Not Sorted ");
        }
        else {
            System.out.println(" Array is Sorted ");
        }
        }
        }





