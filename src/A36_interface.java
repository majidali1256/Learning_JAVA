
interface Q1{
    void Greet();
     void Name();
     default void Num(){
         System.out.println("123");
     }
}
class Q2 implements Q1{
    public void Greet(){
        System.out.println("Hello! ");
    }
    public void Name(){
        System.out.print("MAJID.\n");
    }
}

class Car1{
    int Price2 =4000000;
    public void Horn(){
        System.out.println("Applying Horn");
    }
        }
interface Car{
    int Price=5000000;
    // Cant Modify
    void SpeedUp(int Inc);
    void Brakes(int Dec);
}

// We can Use Multiple Classes to Inherit a Single Child Class in interference
 class Car2 extends Car1 implements Car{
    public void SpeedUp(int Inc){
        System.out.println("\nApplying Speed");
    }
    public void Brakes(int Dec){
        System.out.println("Applying Brakes");
    }
 }

public class A36_interface {
    public static void main(String[] args) {

        Q2 p2 = new Q2();
        p2.Greet();
        p2.Name();
        p2.Num();

        Car2 C = new Car2();
        C.SpeedUp(1);
        C.Brakes(2);
        C.Horn();
        System.out.println("Price is " + C.Price);
        System.out.println("Price2 is "+ C.Price2);

    }
}

