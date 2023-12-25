import java.security.PublicKey;

abstract class Pen{
    abstract void Write();
    abstract void Refill();
}
class FountainPen extends Pen{
    public void Write(){
        System.out.println("Writting");
    }
    public void Refill(){
        System.out.println("Refilling");
    }
    public void ChangeNib(){
        System.out.println("Changing Nib");
    }
}

class Monkey{
    public void Jump(){
        System.out.println("Jumping");
    }
    public void Bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey{
    public void Eat(){
        System.out.println("Eating");
    }
    public void Sleep(){
        System.out.println("Sleeping");
    }
}

public class A37_Exercise {
    public static void main(String[] args) {
FountainPen A = new FountainPen();
A.Write();
A.Refill();
A.ChangeNib();

Human H = new Human();
H.Eat();
H.Sleep();

    }
}
