//Access Modifiers, using Private Variable with the help Of Methods
class Employee1{
   private String name;
   private int id;
   public void setId(int id){
       this.id=id;
   }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class A28_AccessModifier {
    public static void main(String[] args) {
 Employee1 obj = new Employee1();
 obj.setName("MAJID ALI");
        System.out.println(obj.getName());
  obj.setId(1);
        System.out.println(obj.getId());
    } 
}
