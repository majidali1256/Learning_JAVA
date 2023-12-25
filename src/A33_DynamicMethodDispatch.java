class NO1{
    public void Display(){
        System.out.println("Hello 1");
    }
}
class NO2 extends NO1{
    public void Display(){
    System.out.println("Hello 2");
}
}
public class A33_DynamicMethodDispatch {
    public static void main(String[] args) {
        NO1 obj1 = new NO1();
        obj1.Display();

        NO1 obj = new NO2(); //Allowed
        obj.Display(); // Output will be from 2nd Class
    }
}
