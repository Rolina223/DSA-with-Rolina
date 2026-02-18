package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimesionArraysList {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();

        //Initialized the List
        for (int i = 0; i < 3; i++) {
            List.add(new ArrayList<>());
        }

        //Add the elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                List.get(i).add(Sc.nextInt());
            }
        }

        System.out.println(List);
    }
}
