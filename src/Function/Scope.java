package Function;

public class Scope {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);

        {
            // Cannot redeclare 'a' here because it is already declared in outer scope
            a = 30;  // We can modify it
            int d = 50;
            System.out.println(a);
        }

        int d = 60; // This is a new variable (different scope)
        System.out.println(d);

        System.out.println(a); // 30 (updated value)

        {
            a = 70;
        }

        System.out.println(a); // 70
    }
}
