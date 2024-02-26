package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class intro {
    public static void main(String[] args) {
        //allows us to store multiple homogenous values in a single variable
        //syntax of array declaration is --->
        //datatype[] var-name = new datatype[size];

        //eg store 5 roll no.

//        int[] roll_no = new int[5]; //creates an integer array of length 5
        int[] roll_no = {1,2,3,4,5};

        //printing the elements of the array
        for (int i = 0; i < roll_no.length; i++) {
            System.out.print(roll_no[i]);
        }

        //or print the array by -->
        System.out.println(Arrays.toString(roll_no));
    }
}