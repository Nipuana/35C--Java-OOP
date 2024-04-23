package week3;

public class task31 {
    public static void main(String[] args) {
        

        /*Task
         * Consider the variable week in int 
         * if the value is 
         * 0-Print Sunday
         * 1- Print Monday
         * 2-Print Tuesday
         * 4-Print Wednesday
         * 5-Print Thursday
         * 6-Print Friday
         * Print Saturday
         * if the valu is other than Print Invalid week
         */
    
        int weekday=3;
        /*Check availability in switch  */
        
        switch (weekday) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;
        
            default:
                break;
        }
        
    }
}
