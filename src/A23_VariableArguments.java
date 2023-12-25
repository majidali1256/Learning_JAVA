public class A23_VariableArguments {
// using Many Methods
   /* static int sum(int a){
        return a;
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    } */

    //Using 1 Method
    static int sum(int ...arr){
        int sum = 0;
        for ( int element:arr){
            sum+=element;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum is: "+ sum(5));
        System.out.println("Sum is: "+ sum(5,6));
        System.out.println("Sum is: "+ sum(5,6,7));
    }
}
