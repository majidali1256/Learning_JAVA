class Constructor{
    private int ID;
    private String Name;
    public Constructor() {
        ID = 123;
        Name = "MAJID";
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
}
// Overloading in Constructor
class Constructor1{
    private int ID1=123;
    private String Name1="Majid";

    public Constructor1(int ID1, String Name1){
        this.ID1=ID1;
        this.Name1=Name1;
    }

    public int getID1() {
        return ID1;
    }

    public String getName1() {
        return Name1;
    }
}

public class A29_Constructors {
    public static void main(String[] args) {
        Constructor obj = new Constructor();

        System.out.println(obj.getID());
        System.out.println(obj.getName());
// Overloading
        Constructor1 obj1 = new Constructor1(1000,"MAJID");
        System.out.println(obj1.getID1());
        System.out.println(obj.getName());
    }
}
