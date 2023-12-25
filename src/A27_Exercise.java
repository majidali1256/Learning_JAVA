//Problem 1
class Employee{
    int Salary;
    String Name;
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String n){
        Name=n;
    }
}

//Problem 2 Area Of Circle
class Circle{
    public float getArea(int r){
        float area = 3.14f*r*r;
        return area;
    }
}
public class A27_Exercise {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("Majid Ali");
        obj.Salary=100000;
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());

       Circle obj1 = new Circle();
        System.out.println(obj1.getArea(10));
    }
}
