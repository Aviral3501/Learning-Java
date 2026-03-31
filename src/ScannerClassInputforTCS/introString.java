package ScannerClassInputforTCS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class introString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();  // new StringBuilder("Initial String");

//        String[] input = line.trim().split("[,;\\s]+"); // this is what you might use
//        TO USE MULTIPLE DELIMITERS
//         [ DELIMITERS ]
//        REGEX = [DELIMITERS]
//        space = \\s
//        digit=0-9
//        alphabet = a-zA-Z
//        []+ one or more than  one seq
//        \\s* → 0 or more spaces
// ✅ 5. Only numbers extraction
//\\d+
//✅ 6. Words only (letters)
//[a-zA-Z]+
//✅ 7. Alphanumeric tokens
//[a-zA-Z0-9]+
//✅ 8. Remove empty tokens (important trick)
//split("[,\\s]+")



//        1) TAKE A SINGLE STRING ======================================================================================================

//        1.1 input and string in one line (since in the same line : hence no need for extra sc.nextLine )-----------------------

//            int roll;
//            System.out.println("enter roll number");
//            roll=sc.nextInt();
//            String name;
//            System.out.println("Enter the name");
//            name=sc.nextLine();
//            System.out.println("name is "+name);

//        1.2 string and integer on different lines ( here we will need nextLine and sc.______ do not contain \n )--------------

//        int roll;
//        System.out.println("enter roll number");
//        roll=sc.nextInt();
//        String name;
//        System.out.println("escaped :"+sc.nextLine()); // as we take input in different lines (this will only contain \n )
//        System.out.println("Enter the name");
//        name=sc.nextLine();
//        System.out.println("name is :"+name);


//        2) READ MULTIPLE STRINGS IN THE SAME LINE =======================================================================================

//        String str1,str2,str3;
//        System.out.println("Enter three strings space separated in one line");
//        str1=sc.next(); //next only takes space or tabs as delimiters
//        str2=sc.next();
//        str3=sc.next();
//        System.out.println("String 1:"+str1+" String 2:"+str2+" String 3:"+str3);

//        3) READ A FULL LINE / SENTENCE/ PARA ================================================================================================

//        String line;
//        System.out.println("Enter line");
//        line=sc.nextLine();
//        System.out.println("Line :"+line);

//        4) READ A STRING ARRAY SPACE SEPARATED IN ONE LINE =========================================================================

//        String line;
//        System.out.println("Enter the array of strings space separated");
//        line=sc.nextLine();
//        String[] input=line.split(" ");  //String[] arr = line.trim().split("\\s+"); // this is more robust
//        int len=input.length;
//        System.out.println("printing the array of length "+len+" :");
//        for(String s:input){
//            System.out.print(s+" ");
//        }
//        System.out.println();
//        System.out.println("==end==");

//        5) READ A STRING ARRAY COMMA SEPARATED IN ONE LINE ============================================================================

//        String line;
//        System.out.println("Enter the array of strings COMMA separated");
//        line=sc.nextLine();
//        String[] input=line.split(","); //String[] input=line.trim().split("[,]+"); // this is more robust
//        int len=input.length;
//        System.out.println("printing the array of length "+len+" :");
//        for(String s:input){
//            System.out.print(s+" ");
//        }
//        System.out.println();
//        System.out.println("==end==");




//        k) Read until specified =======================================================================================================



//        k.1)  READ UNTIL SPECIAL KEYWORD OR SYMBOL at new line---------------------------------------------------


//        System.out.println("Use 'end' or 'END' at newline to end a string ");
//        while(true){
//            String currLine = sc.nextLine();
//            if(currLine.equalsIgnoreCase("END"))break;
//            sb.append(currLine).append("\n");
//        }
//        String result = sb.toString();
//        System.out.println(result);


//        k.2) READ UNTIL SPECIAL KEYWORD OR SYMBOL (at anywhere)-------------------------------------------------


//        System.out.println("Use 'end' or 'END' to end a string");
//        while (true) {
//            String line = sc.nextLine();
//
//            if (line.contains("END") || line.contains("end")) {
//                int index = line.contains("END") ? line.indexOf("END") : line.indexOf("end");
//                sb.append(line.substring(0, index)); // keep text before END
//                break;
//            }
//
//            sb.append(line).append("\n");
//        }
//
//        String result = sb.toString();
//        System.out.println(result);

//        k.3) Read until a fixed number of lines --------------------------------------------------------------------------

//        int lines;
//        System.out.println("Enter the number of lines");
//        lines=sc.nextInt();
//        sc.nextLine(); // clear newline
//        for (int i = 0; i < lines; i++) {
//            sb.append(sc.nextLine()).append("\n");
//        }
//
//        System.out.println(sb.toString());

//        k.4) READ UNTIL Empty line

//        while (true) {
//            String line = sc.nextLine();
//            if (line.isEmpty()) break;
//            sb.append(line).append("\n");
//        }
//
//        System.out.println(sb.toString());





    }
}
