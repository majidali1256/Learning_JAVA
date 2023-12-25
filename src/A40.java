public class A40
{
    private int a;
    public double b;

    public A40(int first, double second)
    {
        this.a = first;
        this.b = second;
    }

    // new method
    public static void incrementBoth(A40 c1) {
        c1.a = c1.a + 1;
        c1.b = c1.b + 1.0;
    }

    public static void main(String[] args)
    {
        A40 c1 = new A40(10, 20.5);
        A40 c2 = new A40(10, 31.5);
        // different code below
        incrementBoth(c2);
        System.out.println(c1.a + ", "+ c2.a);
    }
}