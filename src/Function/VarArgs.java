package Function;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        func(11,22,"Rolina" ," Liza" ,"Krishna" ,"Bharti");
    }

    // VarArgs -> (String..v -> Takes as much input)
    static void func(int a, int b,String...v)
    {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
