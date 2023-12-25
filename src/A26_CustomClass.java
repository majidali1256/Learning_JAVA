import java.util.Scanner;

 class Class1{
    int a=10;
    int b=5;
    public void Sum(){
        int sum=a+b;
        System.out.println("Sum: "+ sum );
    }
}
public class A26_CustomClass {
    public static void main(String[] args) {
         Class1 obj= new Class1();
         obj.Sum();

    }
}
