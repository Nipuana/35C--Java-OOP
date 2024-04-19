package week2;

import java.util.Scanner;
public class InputOutput {
    
    public static void main(String[] args) {
        
        /*Print/output a line with line break 
         * use "sout" shortcut
         */
        System.out.println("This prints and breaks line");
        // Print the word without line break
        System.out.print("This will not break line");
        System.out.print("This line will continue\n");

        /*Output formatting
         * system.out.printf();
         * %s string, %d integral,%f floating point
         */

         System.out.printf("The next word is %s","New World");
         System.out.printf("The next line is %d",10);
        /*you can use multiple formatter */
        System.out.printf("Multiple of %f %b",10.9f,false);
        /*User input using scanner
         * First import the scanner class
         * import java.util.Scanner. //at the top of the file
         */
   
        Scanner scan=new Scanner(System.in);//System.in is used as input
        System.out.println("The following takes one word from sentence");
        String oneWord=scan.next();
        System.out.println(oneWord);
        System.out.println("the following takes the whole sentence");
        String wholeSentence=scan.nextLine();
        System.out.println(wholeSentence);
        System.out.println("The following takes int");
        int intInput = scan.nextInt();
        System.out.println(intInput);
        System.out.println("The following takes boolean");
        boolean booleanInput=scan.nextBoolean();
        System.out.println(booleanInput);
        scan.close();




        
 }

}
