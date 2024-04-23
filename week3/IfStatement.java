package week3;

public class IfStatement {
    public static void main(String[] args) {
        
        /*Simple if statement, takes condition/expression with boolean value */
    
    if (true){
        System.out.println("True statement");
    }
    
    if (false){
    System.out.println("Skipped statement");
    }
    else{
        System.out.println("False statement");
    }

    /*
     * If condition fails goes to else blok/scope
     */
    int num1=10, num2=20;

    if (num1>num2) 
    {
        System.out.println("num1 is greater");    
    }
    else{
        System.out.println("num2 is greater");
    }
    /*else if */
    int iNum1=10,iNum2=10;
    if(iNum1==iNum2){
        System.out.println("Equal number");
    }
    else if (iNum1>iNum2) {
        System.out.println("iNum1 is greater");
    }
    else{
        System.out.println("iNum2 is greater");
    }
    /*Note that else should be at the last of the if statement */

    /*If Else If ladder, more that one else if */
    if (iNum1<0) {
        System.out.println("iNum1 is negetive number ");      
    }
    else if (iNum2<0) {
        System.out.println("iNum2 is negetive number");
    }
    else if (iNum1==iNum2) {
        System.out.println("equal Number");
    }
    else if (iNum1<iNum2) {
        System.out.println("iNum1 is less");
    }
    else{
        System.out.println("Default execution if all false");
    }

    /*Note that else can be skipped and is not absolutely necessary */
    int q1=10, q2=10;
    if(q1==q2){
        System.out.println("first statement");
    }    
    else if(q1==q2){
        System.out.println("Second statement");
    }
    else{
        System.out.println("Default statement");
    }



    // Nested if statement


int nNum1=-10 , nNum2=20;
if (nNum1<0){
    if(nNum1>nNum2){
        System.out.println("nNum1 is -ve and greaater");
    }
    else{
        System.out.println("nNum1 is -ve and lesser");
    }
}
else{
    if (nNum1>nNum2) {
        System.out.println("nNum1 is +ve and greater");

    }
    else{
        System.out.println("nNum1 is +ve and lesser");
    }
}
         

}
}
