public class A25_ExerciseMethods {

    //TAble Of 7
    static void table(int a){
        for(int i=1; i<=10;i++){
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }

    //Print Pattern 1
    static void Pattern1(int n){
        for (int i =0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print(" \n");
        }
    }

    //sum of Natural Number Using Recursive Method
    static int Sum(int n){
        if (n==0){
            return 0;
        }
        else {
            return n+Sum(n-1);
        }
    }

    // Fabonacci Series
    static int FB(int n){
        if (n==0) { return 0; }
        else if (n==1) { return 1; }
        else { return FB(n-1)+FB(n-2);}
    }

    //Repeat 4 Using Recursion
    static int Recursion(int n){
        return n;
    }

    // Pattern 2 Using Recursion
    static void Pattern(int n) {
        if (n > 0) {
            for (int i=n; i>0; i--) {
                System.out.print("*");
            }
            System.out.print("\n");
            Pattern(n-1);
        }
    }
    //Average Using Arg passing
static void Average(float m1, float m2, float m3){
        float Average = (m1+m2+m3)/3;
    System.out.println("Average is: " + Average);
  }

  //Celcius to Ferenheight
    static void CtoF(float c){
        float Tem=c*9/5+32f;
        System.out.println("Temprature in Fer Is: "+ Tem);
    }

    public static void main(String[] args) {
        table(7);
        Pattern1(5);
        System.out.println(Sum(7));
        System.out.println(FB(6));
        System.out.println(Recursion(4));
        Pattern(5);
        Average(90f,80f,70f);
        CtoF(100f);

    }
}
