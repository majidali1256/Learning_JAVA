abstract class P1{

    public void P1(){
        System.out.println("Constructor of Class P");
    }
    abstract public void Greet();
    abstract public void Name();
}
class P2 extends P1{
   public void Greet(){
        System.out.println("Hello! ");
    }
    public void Name(){
        System.out.print("MAJID.");
    }
}

public class A35_Abstract_Class
{
    public static void main(String[] args) {

        P2 p2 = new P2();
        p2.Greet();
        p2.Name();
    }
}
