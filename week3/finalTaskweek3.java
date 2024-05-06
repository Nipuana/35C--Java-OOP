package week3;

public class finalTaskweek3 {

    public static void main(String[] args) {
        
        /*1. Write a JAVA program to find the maximum between three numbers. */

        int a=10, b=11,c=12;

        if (a>b&&a>c) {
            System.out.println(a+" is the maximum number");
            
        }
        else if(b>a&&b>c){
            System.out.println(b+" is the maximum number");
        }

        else{
            System.out.println(c+" is the maximum number");
        }



        // 2. Write a JAVA program to check whether a number is negative, positive, or zero.

        int a1=20;

        if (a<0) {
            System.out.println(a1+"is a negetive number");
            
        }

        else if (a>0) {
            System.out.println(a1+"is a posetive number");
            
        }

        else{
            System.out.println(a1+"is zero");
        }



        /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */

        int a2=55;

        if (a2%5==0&&a2%11==0) {
            System.out.println(+a2+" is divisible by both 5 and 11");

    
        }
        else if (a2%5==0&&a2%11!=0) {
            System.out.println(a2+" is divisible by 5 but not 11");
            
        }

        else if (a%5!=0&&a%11==0) {
            System.out.println(a2+"is not divisible by 5 but is divisible by 11");
        }
        
        else{
            System.out.println(a2+"is not divisible by neither 5 or 11 ");
        }


        // 4. Write a JAVA program to check whether a number is even or odd.
        int eo=12;
        if (eo<0) {
            System.out.println(eo+ " is a negetive number");
            
        }

        else{
            System.out.println(eo+" is a posetive number");
        }



        /*5. Write a JAVA program to check whether a year is a leap year or not. 

            Hint: if year%4==0; if year%100!==0 ; year%400==0;  */

        int lp=2022;

        if (lp%4==0&&lp%100==0&&lp%400==0) {
            System.out.println(lp+" is a leap year");
            
        }
        else{
            System.out.println(lp+"is not a leap year");
        }

        /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */

    char cv='u';


    if (cv=='a'||cv=='e'||cv=='i'||cv=='o'||cv=='u') {
        System.out.println(cv+" is a vowel alphabet");
    }

    else{
        System.out.println(cv+ " is a consonant alphabet");
    }

    }
    
}
