package Hashmap;
import java.util.*;
public class intro2 {
    public static void main(String[] args) {

//------------------------------- INITIALISATION OF HASHMAP ---------------------------------------------------
        HashMap<String,Integer> map = new HashMap<>();
//        insert the key value pair
        map.put("Aviral",20);
        map.put("Prakhar", 41);
        map.put("Sahil",40);

// print the elements one by one
        System.out.println(map.get("Aviral"));

//return value if present or default value
        System.out.println(map.getOrDefault("Aviral",-1));
        System.out.println(map.getOrDefault("Aviral324",-1));
// print all elements in the map

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//===============================================================================================================
// you can also use for each
// print all elements in the map

        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

//===============================================================================================================

//check if it contains a key
        System.out.println(map.containsKey("Aviral"));
//check if it contains a value
        System.out.println(map.containsValue(20));

//================================================================================================================

//change the value of a specific key
        map.put("Aviral",1);
        System.out.println("new hashmap values  --->");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
//put the key-value , if there is no same key or if it is mapped to null
        map.putIfAbsent("Aviral01",20);
        System.out.println("new hashmap values  --->");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

//========================================================================================================================================


//        how to remove mapping from a key
//        how to delete  an entry key-value pair
//        how to replace a value for a key , if already present

    }
}
