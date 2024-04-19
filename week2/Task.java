package week2;

public class Task {
    public static void main(String[] args) {
    

        
        /*Task1
         * Write a program to print weather a variable is greater or equal to 18; 
         */
        int var=18;
        int comp=20;
        System.out.println("Checking weather the value stored in comp is equal or greater than 18\n "+(comp>=var));

        


        /*Task2
          * Write a program to print simpke interest from variables
          Make 3 variable for amount, time and rate and save the calculation into a variable
          Formula:
          si= amount *time *rate /100;
          */

        int amount=10000,time=2,rate=5;//Time is in years and rate of interest is in percent
        int si=amount* time* rate/100;
        System.out.println(si);



        /*Task3
           * Write a prpogram to print the area and perineter of rectangle
           * a=l*b
           * p=2(l+b)
           */

        int length=12, breadth=8;
        int area= length* breadth;
        System.out.println("The area of the given rectangle is = "+area);
        int perineter=2*(length* breadth);
        System.out.println("The perimeter of the given rectangle is = "+perineter);


        /*Task 4
         * Complete the task 1 using ternary operators
           */

        int ten1=18, ten2=20;
        boolean tenexp=ten2>=ten1;
        String out=tenexp?"Yes the given number is greater than or equals to 18":"No the given number is not greater than or equals to 18";

        System.out.println(out);
        


    }
    
}
