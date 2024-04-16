package week2;

public class VariableClass {

    /*Instance variavle
     * Needs object to access 
     * not shared in multiple object
     */
    int instanceVariable=10;
    /*Static variable
     * No need objects, an be accessed using class
     * shared in multiple object
     */
    static int staticVariable= 100;
    public static void main(String[] args) {
        /*Non Primitive data type
         * Declaration
         */
        byte byteVariable;
        // Initialization
        byteVariable=100;
        // Declaration and Initialization'
        short shortVariable=1000;
        // Multiple declaration
        int intVariable1, intVariable2;
        // Initialization
        intVariable1=10;
        intVariable2=-10;
        // Multiple Declaration and initialization
        long longVariable1=100000, longVariable2=-199999;
        float floatVariable= 1.89f; //the letter'f' is required
        double doubleVariable=189.8923d; //the letter 'd ' is optional
        char charVariable= 'c'; //Single letter enclosed in a single encapsulation
        boolean booleanVariable=true; //small case true/false

        // Illigal action
        // byte byteVariable=20;//cannot redeclare a variable
        
        // byteVariable=30;// instead use reassignment


        //boolean boolVar2='false';// should match exet datatype
        
        //byte byteVariable2=100000;//cannot exced min or max
        
        String stringVariable="This is a string";//use double qutaion ""
        /*or use the class */

        String stringVariable2=new String("String using class");
        /*Class/Object */
        VariableClass variableObject= new VariableClass();
        /*Use the same class Name as specified in public class <ClassName> */ 
        

        /*Need object to access instance variable */
        System.out.println(variableObject.instanceVariable);
        // can access static variable with Class only/ no object needed
        System.out.println(VariableClass.staticVariable);

        // Type casting
        int intVariableConvert=10;
        double intVariableConvertToVariable= intVariableConvert;
        // Explicit casting
        double doubleVariableConvert=100.29;
        int doubleVariableConvertToInt=(int)doubleVariableConvert;
        
       
    //    Printing alll the assigned variables
        System.out.println(byteVariable);
        System.out.println(shortVariable);
        System.out.println(intVariable1);
        System.out.println(intVariable2);
        System.out.println(longVariable1);
        System.out.println(longVariable2);
        System.out.println(floatVariable);
        System.out.println(doubleVariable);
        System.out.println(charVariable);
        System.out.println(booleanVariable);
        System.out.println(stringVariable);
        System.out.println(stringVariable2);
        System.out.println(intVariableConvertToVariable);
        System.out.println(doubleVariableConvertToInt);  


   
   
    }


    
}

    
    