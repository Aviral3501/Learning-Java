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


        //or print the array using for each
        for(int num : roll_no){
            System.out.print(num);
        }

        // int[] roll_no --> declaration of the variable
        //new int[5]; --> creating the object int the heap memory i.e. 5*int(bytes) of  space is allocated(may or may not be continuous)
//            |
//            V
        //dynamic memory allocation happens at runtime ie during execution

//        why array in java may not be continuous?
        /**
         * IN java -->
         * 1)Objects are created in heap
         * 2)Heap may or may not be contiguous
         * Hence array in java may or may not be contiguous
         * Java completely depends on JVM for the allocation of memory space
         */

//        In Java, arrays are contiguous in the sense that their elements are stored in consecutive memory locations. However, the misunderstanding
//        may arise due to the fact that arrays in Java are objects, and when it comes to objects, the elements themselves are not stored directly
//        in the array, but rather, references to objects are stored.


//        So, while the array itself is a contiguous block of memory, the elements within the array (especially for objects) might be scattered in
//        different parts of the memory, depending on where the objects are dynamically allocated. This contrasts with languages like C or C++, where
//        arrays of objects store the actual objects in contiguous memory locations. Java's approach allows for better memory management and flexibility
//        but introduces a layer of indirection through object references.

// for  more detail --> https://chat.openai.com/share/59dd8468-581d-4ec6-9178-38d1ae50495b









    }
}