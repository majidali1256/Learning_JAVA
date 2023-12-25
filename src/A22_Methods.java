import java.util.Scanner;
public class A22_Methods {
   int cal1(int a,int b){
      int c=a-b;
      return c;
  }
    static int cal(int a,int b){
        int c;
        if(a>b){
            c=a+b;
        }
        else{
            c=a*b;
        }
        return c;
    }
    public static void main(String[] args) {
        int x=15;
        int y=10;
        int z = cal(x,y);
        A22_Methods obj = new A22_Methods();
        int z2 =obj.cal1(x,y);

        int x1=2;
        int y1=3;
        int z1 = cal(x1,y1);
        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);
    }
}

