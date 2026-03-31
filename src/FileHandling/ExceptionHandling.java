package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionHandling {



    public static void main(String[] args) throws IOException {
        String filePath ="./files/data.csv";
        String filePath1 ="files/data.csv";
        testFile03(filePath);
        System.out.println("==============================================");
        testFile03(filePath1);

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




