public class A20_Arrays {
    public static void main(String[] args) {
        System.out.println(" Using Arrays");
        //initializing and then Declaring Values
        int [] array = new int[3];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        System.out.println(array[2]);

        //Declaring and Intializing at the same time
        int [] array1 = {10,20,30};
        System.out.println(array1[2]);

        // Printing Array
        System.out.print("The Array is: " );
for (int i=0; i< array1.length; i++ ) {
    System.out.print(array1[i]+ " ");
}
// Printing Array in Reverse Order
        System.out.print("\nThe Array is in Reverse order is: " );
        for (int i= array1.length-1; i>=0; i-- ) {
            System.out.print(array1[i]+ " ");
        }

        // Printing Array in New Way
        System.out.print("\nThe Array is: ");
        for (int element:array1){
            System.out.print(element + " ");
        }
        System.out.println("\nThe lenght of array is: " + array1.length);
    }
}
