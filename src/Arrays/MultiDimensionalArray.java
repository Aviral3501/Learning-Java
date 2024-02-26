package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
/*
            2 dimensional array is a matrix -->

------------------------------------------------------------------------------------------------------
            1 2 3
            4 5 6
            7 8 9
------------------------------------------------------------------------------------------------------
            now while defining a 2-d array we require how much rows we need

            ie   int[][] arr = new int[3][]; is correct
            but  int[][] arr =new int[][3]; is not correct xx , adding the number of columns is not mandatory

            -->While initializing a 2-d array, mentioning the number of rows is mandatory<--
 */

        int[][] arr = new int[3][3];

//        or you can store in another way

/*
            int[][] arr = {
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
                    }
 */
// 2d array is an array of arrays  ---> how they are stored
//   same the there is an array in continuous memory location , with each item as a reference to an array
//        stored in some part of the heap


/*
        Remember the size of each array in the 2-d array does not matter , they can be same or different
        and hence while defining 2-d array we need mention rows i.e. how many arrays are we gonna store , but
        their individual size does not matter

        2-d array can also be -->
        ----------------------------------------------------------------------------------------------
        1 2 3
        4 5
        6 7 8 9
        ----------------------------------------------------------------------------------------------
 */

        int[][] arr1 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }

//inputting an 2-d array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int arr2[][] =new int[rows][];
        for(int i=0;i<rows;i++){
            //find the size of each array
            int size;
            System.out.println("Enter the size of "+(i+1)+" array");
            size=sc.nextInt();

            // Initialize the subarray with the specified size
            arr2[i] = new int[size];
            for(int j=0;j<size;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        //printing the 2-d array

//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }

//
//------------------------------------------------------------------------------------------------

        for(int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
//-----------------------------------------------------------------------------------------------
        //or
        for(int[] temp:arr2){
            System.out.println(Arrays.toString(temp));
        }
    }
}
