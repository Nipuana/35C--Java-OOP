

public class JavaArgument {
    public static void main(String[] args) {
        
        /*the args in the main function can be used 
         * to take input from command line 
         * when executing the file we can pass arguement
         *Eg:
         java JavaArguement arg1 arg2
         the arg1 and arg2 can be accessed from args
         */
        if (args.length<2){
            System.out.println("Please provide 2 arguement");
            return;
        }        

        /*use index of args array to access */
        System.out.println("Arguement 1 is "+ args[0]);
        System.out.println("Arguement 2 is "+ args[1]);

}
    
}
