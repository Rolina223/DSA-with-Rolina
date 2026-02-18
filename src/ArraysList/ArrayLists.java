package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static void main(String[] args) {

      ArrayList<Integer>  List = new ArrayList<>();

        List.add(12);
        List.add(13);
        List.add(14);
        List.add(15);
        List.add(16);
        List.add(17);
        List.add(18);

        System.out.println(List);

        List.add(0,55);
        System.out.println(List);
        List.remove(6);
        System.out.println(List);


    }

}
