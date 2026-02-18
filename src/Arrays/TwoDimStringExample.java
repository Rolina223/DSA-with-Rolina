package Arrays;

import java.util.Arrays;

public class TwoDimStringExample {


    public static void main(String[] args) {

        // 2D String array (matrix type structure)
        String[][] names = {
                {"Rahul", "Aman", "Priya"},
                {"Neha", "Simran"},
                {"Kunal", "Rohit", "Ankit", "Sara"}
        };

        for(String[] name : names) //This loop traverse each row String[0]
        {
            for(String n : name) //This loop will print the element of particular row
            {
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }

    }
}

