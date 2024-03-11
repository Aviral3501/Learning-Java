package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class intro {
    public static void main(String[] args) {

        /*
        Why do we need an arraylist ?
        --> to create an array we must know beforehand what size it should be
        --> cannot alter the size of the array if required
        -->can dynamically add remove data
         */

//        How to create an arraylist ?
//        ArrayList<datatype>  list-name = new ArrayList<datatype>(initialSize);

//        Integer Arraylist
        ArrayList<Integer> intList = new ArrayList<Integer>(10);
//                 OR
        ArrayList<Integer> intList1 = new ArrayList<>(10);//it is not mandatory to write data type

        //how to add an element in arraylist
        intList.add(1);
        for(int i=2;i<=10;i++){
            intList.add(i);
            //also use intList.add(index, value);
        }
        //or you can enter them by manually
        //print the list
        System.out.println(intList);

//        ----------------------------------------------------------------------------------

        //delete an item from the list
        intList.remove(9);
        System.out.println(intList);

//        -----------------------------------------------------------------------------------

        //update a value at an index
        intList.set(4 , 1000);
        System.out.println(intList);

//        -----------------------------------------------------------------------------------
        //clear the list
//        intList.clear();
//        System.out.println(intList);

//        ---------------------------------------------------------------------------------

        //check if an element is present in the ArrayList
        System.out.println(intList.contains(4));

//        -----------------------------------------------------------------------------------






    }
}
