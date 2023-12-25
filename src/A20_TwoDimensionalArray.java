import java.util.Scanner;
public class A20_TwoDimensionalArray {
    public static void main(String[] args) {
        //initializing and then Declaring Values
        int [][] record = new int[2][3];
        record[0][0]=10;
        record[0][1]=20;
        record[0][2]=30;
        record[1][0]=40;
        record[1][1]=50;
        record[1][2]=60;

        for (int i=0; i<record.length; i++){
            for (int j=0; j<record[0].length; j++){
            System.out.print(record[i][j] + " ");  }
            System.out.print("\n");
        }

        //Declaring and Intializing at the same time
        int [][] record1 = {{40,50,60},{10,20,30}};

        for (int i=0; i<record.length; i++){
            for (int j=0; j<record[0].length; j++){
                System.out.print(record[i][j] + " ");  }
            System.out.print("\n");
        }
    }
}
