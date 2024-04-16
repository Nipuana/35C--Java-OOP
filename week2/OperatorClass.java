package week2;

public class OperatorClass {
    public static void main(String[] args) {
        /*Airthmatic Operation */

        float a =10, b=20;
        float sum =a+b;//Here is an airthmatic operation
        System.out.println("The sum is " +sum);
 
        System.out.println("The difference is " +(a-b));
        System.out.println("The multiplication is " +(a*b));
        System.out.println("The division is " +(a/b));
        System.out.println("The modulo is " +(a%b));

        /*Assignment operator */
        /*Declaration and assignment */

        int number1=10;
        int number2;
        /*Assignent after declaration */
        number2=20;
        // Assigning value using += 
        System.out.println("Number2 after using += is"+ (number2+=10));
        // Assigning using *= 
        number2*=100;//this is as sae as doing number2=number2*100
        System.out.println("Number2 after using *-= is " +number2);
        System.out.println(number1);

        /*Relational Operators */
        int rNumber1=9 , rNumber2=20;
        System.out.println("Is rNumber1 equals t0 rNumber2?\n" +(rNumber1==rNumber2));
        System.out.println("Is rNumber1 less than rNumber2?\n" +(rNumber1<rNumber2));
        System.out.println("Is rNumber1 greater than or equals rNumber2?\n" +(rNumber1>=rNumber2));
        System.out.println("Is rNumber1 is not equals to rNumber2?\n" +(rNumber1!=rNumber2));


        /*Logical operator */
        int lNumber1=20, lNumber2=20;
        boolean expression1=lNumber1==lNumber2;
        boolean expression2=lNumber1>lNumber2;
        System.out.println("And expression using && " + (expression1&&expression2));
        System.out.println("Or expression using || " + (expression1||expression2));
        System.out.println("Not expression using ! "+(!expression1));


        /*Unary operation */
        int uNumber1=10;
        uNumber1++;
        System.out.println("Unary operation using ++ " + uNumber1);//same as using uNumber1=uNumber1+1;
        uNumber1--;
        System.out.println("Unary operation using-- " + uNumber1);//same as using uNumber1=uNumber1-1;


        /*Ternary Operation */

        int tNumber1=20,tNumber2=20;
        boolean tExpression1= tNumber1==tNumber2;


        /*For tenary, First you define expressionm if expression is true 
         * it returns value afrer ":"
         * Syntax
         * expression ? true statement :false statement
         */

        String output=tExpression1? "True Condition":"False Condition";
        /*Furthur seen as
         * if(tExpression1){
         * output="True Condition"
         * }else{
         * output="False Condition"
         * }
         */
        int numberOutput = tNumber2>tNumber2? 10:20;
        System.out.println(output);
        System.out.println(numberOutput);
    
    
    }
    
}
