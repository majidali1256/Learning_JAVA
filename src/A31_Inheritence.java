class Base{
    int x;
    public Base(){
        System.out.println("I am a Constructor");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

}
class Derived extends Base{
    int y;
    public Derived(){
        System.out.println("I am a Constructor1");
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class A31_Inheritence {
    public static void main(String[] args) {
Derived obj = new Derived();
    obj.setX(7);
    System.out.println("Value of X is " + obj.getX());
    obj.setY(5);
    System.out.println("Value of Y is " + obj.getY());
  


    }
}
