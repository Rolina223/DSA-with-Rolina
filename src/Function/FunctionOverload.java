package Function;

public class FunctionOverload {

    //  Valid – Different number of parameters
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Valid – Different parameter type
    static double add(double a, double b) {
        return a + b;
    }

    //  Valid – Different order of parameters
    static void show(int a, String b) {
        System.out.println("Int first, String second");
    }

    static void show(String a, int b) {
        System.out.println("String first, Int second");
    }

    //  Valid – Widening
    static void display(long a) {
        System.out.println("long method");
    }

    //  Valid – Autoboxing
    static void print(Integer a) {
        System.out.println("Integer object method");
    }

    //  Valid – Varargs
    static void demo(int... a) {
        System.out.println("Varargs method");
    }

    /*
    INVALID CASES (Uncomment karoge to compile error aayega)

    //  Only return type different (NOT overloading)
    static double add(int a, int b) {
        return a + b;
    }

    //  Same parameter list (variable name change doesn't matter)
    static int add(int x, int y) {
        return x + y;
    }

    //  Only access modifier change (NOT allowed)
    private static int add(int a, int b) {
        return a + b;
    }
    */

    public static void main(String[] args) {

        // Different number of parameters
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));

        // Different type
        System.out.println(add(2.5, 3.5));

        // Different order
        show(10, "Hello");
        show("Hi", 20);

        // Widening (int → long)
        display(10);

        // Autoboxing (int → Integer)
        print(100);

        // Varargs
        demo(1, 2, 3, 4);

    }

}
