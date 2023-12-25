public class A22_MethodsOverloading {
    static void Wish(){
        System.out.println("Hello MAjid!");
    }
    static void Wish(int a){
        System.out.println("Hello Majid "+ a + " Times");
    }
    static void Wish(int a,int b){
        System.out.println("Hello Majid "+ a + " Times");
        System.out.println("Hello Majid "+ b + " Times");
    }
    static int change(int x){
        x=10;
        return x;
    }
    static int change1(int [] y){
        y[1]=20;
        return y[1];
    }
    static void Hello(){
        System.out.println(" Hello MAJID!");
    }
    public static void main(String[] args) {
        Hello();

        //it doesnt Change
        int a=5;
        int b = change(a);
        System.out.println("Value of a After Change " + a);

        //Array Does change
        int [] c= {1,2,3,4};
        int d = change1(c);
        System.out.println(" Value of index 1 after Chnage " + d);

        // Overloading
        Wish();
        Wish(300);
        Wish(500,1000);
    }
}
