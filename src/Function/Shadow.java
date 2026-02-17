package Function;

public class Shadow {

   static int y = 30;

    public static void main(String[] args) {

        int y = 10;

        System.out.println(y); // The value of Y outer scope variable is shadow by inner scope local variable

        System.out.println(Shadow.y);

       /* int z;
        System.out.println(z); //This will give error because value is not initliazed
        z = 30;
        */
    }
}
