package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionHandling {

//    A runtime error is called an exception .
//    2 types - checked exception and unchecked exception


//    A checked exception represents an anticipated or common problem that might occur
//    How to handle a checked exception
//    2 ways ->
//    1) wrap the code in the try catch block and handle the situation in the catch block
//    2)change the method signature,declaring a throws clause, and specifying the exception type

//    try block --> contains the block of code which may throw exceptions
//    catch block --> catch the exceptions thrown by the try block,print apt message
//    finally block --> will get executed, irrespective of the occurrence of exception, usually used for cleanup operations
//                        (having a single block of code to perform cleanup operations ).
//                      i.e. closing open connections , releasing locks or freeing up resources
//
// trywith syntax is much better than finally for cleanup operations


    public static void main(String[] args) throws IOException {
        String filePath ="./files/data.csv";
        String filePath1 ="files/data.csv";
        testFile03(filePath);
        System.out.println("==============================================");
        testFile03(filePath1);

    }

    private static void testFile(String fileName){
        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
        }catch(IOException e){
            throw new RuntimeException(e);
        }finally {
            System.out.println("here..........");
        }
        System.out.println("File exists, you can use it");
    }

    private static void testFile02(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        FileReader reader = null;
        try{
            reader = new FileReader(fileName);
        }catch(IOException e){
            throw new RuntimeException(e);
        }finally {
            if(reader!=null){
                reader.close();
            }
            System.out.println("here.............");
        }
        System.out.println("File exists, you can use it");
    }

    private static void testFile03(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File " + filePath + " does not exist.");
            return;
        }
        System.out.println("File exists,you can use it---->");
        try (FileReader reader = new FileReader(file)) {
            int data = reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data= reader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File "+file+" does not exist.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            System.out.println("Something unexpected happened.");

        }finally {
            System.out.println();
            System.out.println("here............");
        }


    }

}




