class A{
    public void A1(){
        System.out.println("Method of Class 1");
    }
}
class B extends A{
    public void A1(){
        System.out.println("Method of Class 2");
    }
}
public class A32_MethodOverloading {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
         a.A1();
         b.A1();
    }
}
